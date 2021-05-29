package Client.UI;

import Client.GameController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Client.Send;
import Client.GameController;

public class Blackbtn extends JButton {
    private Brush brush;

    public Blackbtn(){
        setBounds(10,10,70,40);
        setBackground(Color.BLACK);
    }
    private void makeEvent(){
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(GameController.turnflag==true){
                    Send.writer.println("Color:BLACK");
                    Send.writer.flush();
                    brush.setColor(Color.BLACK);
                }
            }
        });
    }

    public void setBrush(Brush brush){
        this.brush = brush;
        makeEvent();
    }
}
