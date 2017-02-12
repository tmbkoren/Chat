import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

public class Client{
	private Socket socket;
	public static String nickname;
	static DataInputStream dis = null;
	static DataOutputStream dos = null;
	static LoginGUI loginGUI = null;
	static ChatGUI chatGUI = null;
	public Client(String ip, int port) throws UnknownHostException, IOException{
			socket = new Socket(ip, port);
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			loginGUI = new LoginGUI();
			loginGUI.frame.setVisible(true);
	}
	static void setNickname(){
		nickname = loginGUI.textField.getText();
		chatGUI = new ChatGUI(nickname);
		chatGUI.frame.setVisible(true);
		new ClientReaderThread(dis);
	}
	static void sendMessage(String message) throws IOException{
		Date date = new Date();
		dos.writeUTF(date.toString()+" "+nickname+" "+message);
		dos.flush();
	}
	static void gettingMessage(String message){
		chatGUI.textArea.append(message);
		chatGUI.textArea.append("\n");
	}
}
