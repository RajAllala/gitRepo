package RunAppPackage;



import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopScoreDocCollector;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.sax.BodyContentHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.xml.sax.SAXException;


import com.teama.DTO.QuestionsDTO;
import com.teama.test.impl.TestIMPL;



@Service
public class RunApp {
	static String indexDir = "E:\\Lucene\\Index";
	public static IndexWriter w;
	static StandardAnalyzer analyzer = new StandardAnalyzer(Version.LUCENE_4_10_3);;
	static Directory indexDirectory;
	
	
	
	
	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		//String id="10";
		
		//DocumentDAO docDAO = new DocumentDAOImpl();
	    	 // documentDAO.persistDocument(uploaded_by, data, doc_name, content_type)
		//String id= documentDAO.persistDocument(userName, bytes, title, fileType);
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springbeans.xml");
		TestIMPL test = (TestIMPL) ctx.getBean("test");
		/*String username="abc@gmail.com";
		String question="who is allala ? ";
		String id="1L";
		IndexWriter(username,question,id);*/
		List<QuestionsDTO> questions= searchQuery("adama");
	      

	}
	
	
	
	private static void addDoc(IndexWriter w, String title, String text, String id ) throws IOException {
	    Document doc = new Document();
	    doc.add(new TextField("title", title, Field.Store.YES));
	    doc.add(new TextField("content", text, Field.Store.YES));
	    // use a string field for isbn because we don't want it tokenized
	    doc.add(new StringField("id", id, Field.Store.YES));
	    w.addDocument(doc);
	  }
	//index writer
	public static void IndexWriter(String title, String text, String id) throws IOException{
		indexDirectory =  FSDirectory.open(new File(indexDir));
		 /*Directory indexDirectory = new RAMDirectory();*/

		

	    // 1. create the index
	    

	    IndexWriterConfig config = new IndexWriterConfig(Version.LUCENE_4_10_3, analyzer);


		      //create the indexer
	    
	    
	    IndexWriter w = new IndexWriter(indexDirectory, config);
	    
	    	System.out.println("title "+title+" text="+ text);
		      addDoc(w, title,text,id );
		      
	    
		      w.close();
		
	}
	
	
public static String tikaService(byte[] bytes) throws IOException{
	ByteArrayInputStream bInput = new ByteArrayInputStream(bytes);

    //tika
    
  
  	  
    	  BodyContentHandler textHandler=new BodyContentHandler(Integer.MAX_VALUE);
  	  Metadata metadata=new Metadata();
  	  AutoDetectParser parser=new AutoDetectParser();
  	  String extract = "";
  	 try {
  		 parser.parse(bInput, textHandler, metadata);
  		 extract = textHandler.toString();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TikaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  	 
  	 
  	  return textHandler.toString();
}
public static List<QuestionsDTO> searchQuery(String querystr) throws ParseException, IOException
{
	
	
	//search
	   // 2. query
	     

	      // the "title" arg specifies the default field to use
	      // when no field is explicitly specified in the query.
	      
	      Query q = new MultiFieldQueryParser(Version.LUCENE_40, new String[]{"title","content"}, analyzer).parse(querystr);
	      indexDirectory =  FSDirectory.open(new File(indexDir));
	      // 3. search
	      int hitsPerPage = 50;
	      IndexReader reader = DirectoryReader.open(indexDirectory);
	      IndexSearcher searcher = new IndexSearcher(reader);
	      TopScoreDocCollector collector = TopScoreDocCollector.create(hitsPerPage, true);
	      searcher.search(q, collector);
	      ScoreDoc[] hits = collector.topDocs().scoreDocs;
	      List<QuestionsDTO> results= new ArrayList<QuestionsDTO>();
		    // myfile obj1 = new myfile();
		      
		      for(int i=0;i<hits.length;++i) {
		    	  QuestionsDTO obj = new QuestionsDTO();
		    	 
		      		        int docId = hits[i].doc;
		      		        Document d = searcher.doc(docId);
		      		       System.out.println("content="+d.get("content"));
		      		     System.out.println("title="+d.get("title"));
		      		       obj.setQuestionText(d.get("content"));
		                          obj.setId((d.get("id")));
		                          obj.setUsername(d.get("title"));
		                          results.add(obj);
		                         //obj=  null;
		      		      }
	      reader.close();
	      return results;
	      
	      //search end
}
}