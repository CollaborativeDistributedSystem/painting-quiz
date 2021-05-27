package Client;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.image.BufferedImage;
import java.net.Socket;
import Client.UI.*;

public class Controller {

    private Socket Server;
    private String ip=null;
    private String ans=null;
    private int port=0;
    private Send SendThread;
    private Receive ReceiveThread;
    private Brush brush;
    private BufferedImage imgbuff;
    private JTextArea screen;
    private String id="test";
    private JTextField answerfield;

    public void start() {
        if(ip!=null && port!=0) {
            connectServer();
            //	makeThread();
        }
    }

    public void setIP(String ip) {
        this.ip = ip;
    }

    public void setPort(int port) {
        this.port = port;
    }
    public void setAns(String ans){this.ans = ans;}
    private void connectServer() {
        try {
            Server = new Socket(ip,port);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void makeThread() {
        SendThread = new Send();
        ReceiveThread = new Receive();
        SendThread.setSocket(Server);
        SendThread.setId(id);
        SendThread.setAns(ans);
        SendThread.start();
        ReceiveThread.start();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setScreen(JTextArea screen) {
        this.screen = screen;
    }

    public void setBrush(Brush brush) {
        this.brush = brush;
    }

    public void setImgbuff(BufferedImage imgbuff) {
        this.imgbuff = imgbuff;
        makeThread();
    }
    public void setAnswerField(JTextField answerfield) {
        this.answerfield = answerfield;
    }
}