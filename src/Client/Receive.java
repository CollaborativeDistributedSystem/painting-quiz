package Client;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.io.BufferedReader;

public class Receive extends Thread{
    private Socket Server;
    private BufferedReader reader;

    public void setSocket(Socket Server) {
        this.Server = Server;
    }

    private void makeReader() {
        try {
            reader = new BufferedReader(new InputStreamReader(Server.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void receive(){
    }

}
