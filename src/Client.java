import java.net.Socket;

public class Client {
	Socket socket;
	public static void main(String[] args){
		
	}
	Client(String ipAddress, int port){
		try {
			socket = new Socket(ipAddress, port);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}