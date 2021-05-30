package Client.UI;

import Client.GameController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Client.Send;
import Client.GameController;
public class Graybtn extends JButton {

    private Brush brush;

    public Graybtn(){
        setBounds(10, 320, 70, 40);
        setBackground(Color.GRAY);
    }
    private void makeEvent() {
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(GameController.turnflag==true) {
                    Send.writer.println("Color:GRAY");
                    Send.writer.flush();
                    brush.setColor(Color.GRAY);
                }
            }
        });
    }

    public void setBrush(Brush brush) {
        this.brush = brush;
        makeEvent();
    }

}
