package Client.UI;

import Client.GameController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Client.Send;
import Client.GameController;
public class Bluebtn extends JButton {

    private Brush brush;

    public Bluebtn(){
        setBounds(10, 210, 70, 40);
        setBackground(Color.BLUE);
    }
    private void makeEvent() {
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(GameController.turnflag==true) {
                    Send.writer.println("Color:BLUE");
                    Send.writer.flush();
                    brush.setColor(Color.BLUE);
                }
            }
        });
    }

    public void setBrush(Brush brush) {
        this.brush = brush;
        makeEvent();
    }

}
