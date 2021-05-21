package Server;

import java.net.Socket;

public class User {
    private Socket Client;
    private String id;
    private String ans;

    public void setSocket(Socket Client){
        this.Client=Client;
    }

    public void SendMessage(String msg){

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
