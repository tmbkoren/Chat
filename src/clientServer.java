import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class clientServer {
	private Socket socket;
    private DataOutputStream dos;
    private DataInputStream dis;

    public clientServer(Socket socket){
        this.socket = socket;
    }

    public clientServer(Socket socket , DataOutputStream dos , DataInputStream dis ){
        this.socket = socket;
        this.dos = dos;
        this.dis = dis;
    }

    public Socket getSocket() {
        return this.socket;
    }

    public DataOutputStream getThisDataOutputStream() {
        return this.dos;
    }

    public DataInputStream getThisDataInputStream() {
        return this.dis;
    }

    public void setThisDataOutputStream(DataOutputStream dos) {
        this.dos = dos;
    }

    public void setThisDataInputStream(DataInputStream dis) {
        this.dis = dis;
    }

}
