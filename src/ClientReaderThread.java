import java.io.DataInputStream;
import java.io.IOException;

public class ClientReaderThread extends Thread {
	DataInputStream dis;
	String message;
	public ClientReaderThread(DataInputStream dis){
		this.dis = dis;
		this.start();
	}
	public void run(){
		while(true){
			try {
				message = dis.readUTF();
				Client.gettingMessage(message);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
