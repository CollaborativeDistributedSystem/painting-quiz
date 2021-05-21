package Server;
import java.net.Socket;
import java.io.BufferedInputStream;
import java.io.BufferedReader;

public class ServerThread extends Thread{

    private User user;

    public void run(){
        super.run();

    }
    public void setUser(User user){
        this.user=user;
    }
}
