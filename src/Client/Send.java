package Client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Send extends Thread{
    private Socket Server;
    static public PrintWriter writer;
    private String id;
    private String ans;

    public void setId(String id) {
        this.id = id;
    }
    public void setAns(String ans){this.ans = ans;}
    public void setSocket(Socket Server) {
        this.Server = Server;
    }

    private void makeWriter(){
        try{
            writer = new PrintWriter(Server.getOutputStream());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void sendID(){
        writer.println(id);
        writer.flush();
    }

    private void sendANS(){
        writer.println(ans);
        writer.flush();
    }



}
