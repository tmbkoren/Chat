import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UsersList {
	UsersList(){
		
	}
	private Map<String, clientServer> onlineUsers = new HashMap<String, clientServer>();
	
	public void addUser(String nickname, Socket socket,  DataOutputStream dos, DataInputStream dis){
		System.out.println("User " + nickname + " connected");
		if (!this.onlineUsers.containsKey(nickname)) {
            this.onlineUsers.put(nickname , new clientServer(socket, dos, dis));
        } else {
            int i = 1;
            while(this.onlineUsers.containsKey(nickname)) {
                nickname = nickname + i;
                i++;
            }
            this.onlineUsers.put(nickname , new clientServer(socket, dos, dis));
        }
	}
	public void deleteUser(String login) {
        this.onlineUsers.remove(login);
    }

}
