import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;

public class ClientThread extends Thread {
	private Socket socket;
	DataInputStream dis;
	DataOutputStream dos;
	String nickname;
	 ClientThread(String nickname, Socket socket){
		 this.socket = socket;
		 this.start();
	 }
	 public void run(){
		 try{
			 String message;
			  dis = new DataInputStream(socket.getInputStream());
			  dos = new DataOutputStream(socket.getOutputStream());
			  Server.list.addUser(nickname, socket, dos, dis);
			 while(true){
				 message = dis.readUTF();
				 broadcast(Server.getUserList().getClientsList(), message);
			 }
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
	 }
	 private void broadcast(ArrayList<clientServer> clientsArrayList, String message) {
		   try {
		      for(clientServer client : clientsArrayList){
		    	  client.getThisDataOutputStream().writeUTF(message);
		      }
		   } catch (SocketException e) {
		      System.out.println("Error sending message");
		   } catch (IOException e) {
		      e.printStackTrace();
		   }
		}
}
