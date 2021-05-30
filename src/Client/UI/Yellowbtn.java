package Client.UI;

import Client.GameController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Client.Send;
import Client.GameController;
public class Yellowbtn extends JButton {

    private Brush brush;

    public Yellowbtn(){
        setBounds(10, 160, 70, 40);
        setBackground(Color.YELLOW);
    }
    private void makeEvent() {
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(GameController.turnflag==true) {
                    Send.writer.println("Color:YELLOW");
                    Send.writer.flush();
                    brush.setColor(Color.YELLOW);
                }
            }
        });
    }

    public void setBrush(Brush brush) {
        this.brush = brush;
        makeEvent();
    }
}