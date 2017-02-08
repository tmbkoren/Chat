import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		int port;
		ServerSocket servSocket = null;
		System.out.println("Select port....");
		try {
			port = Integer.parseInt(reader.readLine());
			servSocket = new ServerSocket(port);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true){
			Socket client = null;
			while(client == null){
				try{
					client = servSocket.accept();
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
			new ClientThread(client);
		}

	}

}
