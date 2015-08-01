import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class Testt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HttpClient httpClient = new DefaultHttpClient();
	    try {
	      HttpGet httpGetRequest = new HttpGet("http://192.168.1.141:8094/docxchange/mail/66");
	      HttpResponse httpResponse = httpClient.execute(httpGetRequest);
	    }catch(Exception e){
	    	e.printStackTrace();
	    }

	}

}
