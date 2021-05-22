package Server;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.io.BufferedInputStream;
import java.io.BufferedReader;

public class ServerThread extends Thread{

    private User user;
    private Socket Client;
    private BufferedReader userin;

    public void run(){
        super.run();

    }

    public void setUser(User user){
        this.user=user;
    }

    public void makeUserInBuffer(){
        try{
            userin=new BufferedReader(new InputStreamReader(Client.getInputStream()));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private void waitMsg(){
        while(true){
            try{

            }catch (IOException e){

            }
        }
    }
}
