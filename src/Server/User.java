package Server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class User {
    private Socket Client;
    private String id;
    private String ans;
    private PrintWriter send;


    public void setSocket(Socket Client){
        this.Client=Client;
    }

    public void makeWriter(){
        try{
            send = new PrintWriter(Client.getOutputStream());
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void SendMessage(String msg){
        send.println(msg);
        send.flush();
    }

    public Socket getClient(){
        return this.Client;
    }

    public void SetUserID(String id){
        this.id = id;
    }

    public String getUserID(){
        return this.id;
    }

    public void setUserANS(String ans){
        this.ans = ans;
    }

    public String getUserAns(){
        return this.ans;
    }
}