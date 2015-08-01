package com.teama.LuceneService;


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
import org.apache.lucene.store.NoLockFactory;
import org.apache.lucene.util.Version;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.sax.BodyContentHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.xml.sax.SAXException;

import com.teama.DTO.QuestionsDTO;
import com.teama.entities.Questions;
import com.teama.service.ForumService;

@Service
@Transactional
public class LuceneService {
	static String indexDir = "C:\\Lucene\\Index";
	private  static IndexWriter w = null;
	static StandardAnalyzer analyzer = new StandardAnalyzer();
	static Directory indexDirectory;
	private static IndexReader reader = null;
	@Autowired
	ForumService forumService;
	
	public void LucenceService(String question, String username) throws IOException {
		// TODO Auto-generated method stub
		//String id="10";
		
		//DocumentDAO docDAO = new DocumentDAOImpl();
	    	 // documentDAO.persistDocument(uploaded_by, data, doc_name, content_type)
	String id=forumService.persistQuestion(question, username);
    	
	    	 IndexWriter(username,question,id);
	    	 //search("abcde");
	      

	}
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
	private static void addDoc(IndexWriter w, String title, String text, String id ) throws IOException {
	    Document doc = new Document();
	    doc.add(new TextField("title", title, Field.Store.YES));
	    doc.add(new TextField("content", text, Field.Store.YES));
	    // use a string field for isbn because we don't want it tokenized
	    doc.add(new StringField("id", id, Field.Store.YES));
	    w.addDocument(doc);
	  }
		@SuppressWarnings("deprecation")
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
