import java.net.InetAddress;
import java.net.UnknownHostException;


public class GetIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String ipAddress = request.getRemoteAddr();
		
		
		InetAddress IP = null;
		try {
			IP = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("IP of my system is := "+IP.getHostAddress());

	}

}
