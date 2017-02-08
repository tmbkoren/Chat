import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {
	private String login;
	private String message;
	private String[] users;
	private Date time;
	
	public Message(String login, String message, Date time){
		this.login = login;
		this.message = message;
		this.time = time;
	}
	public Message(String login, String message, String[] users, Date time){
		this.login = login;
		this.message = message;
		this.users = users;
		this.time = time;
	}
	public void setOnlineUsers(String[] users){
		this.users = users;
	}
	public String getLogin(){
		return this.login;
	}
	public String getMessage(){
		return this.message;
	}
	public String getDate(){
		Date tm = new Date(this.time.getTime());
		return tm.toString();
	}
	

}
