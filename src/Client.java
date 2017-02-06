import java.net.Socket;

public class Client {
	Socket socket;
	Client(String ipAddress, int port){
		try {
			socket = new Socket(ipAddress, port);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
