package Client.UI;


import Client.GameController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Client.Send;
import Client.GameController;
public class Greenbtn extends JButton {

    private Brush brush;

    public Greenbtn(){
        setBounds(10, 110, 70, 40);
        setBackground(Color.GREEN);
    }
    private void makeEvent() {
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(GameController.turnflag==true) {
                    Send.writer.println("Color:GREEN");
                    Send.writer.flush();
                    brush.setColor(Color.GREEN);
                }
            }
        });
    }

    public void setBrush(Brush brush) {
        this.brush = brush;
        makeEvent();
    }
}