package Client.UI;

import Client.GameController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Client.Send;
import Client.GameController;
public class Erasebtn extends JButton {

    private Brush brush;

    public Erasebtn(){
        super("Eraser");
        setBounds(10, 430, 70, 40);
        setFont(getFont().deriveFont(7f));
        setBackground(Color.WHITE);
    }
    private void makeEvent() {
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(GameController.turnflag==true) {
                    Send.writer.println("Color:WHITE");
                    Send.writer.flush();
                    brush.setColor(Color.WHITE);
                }
            }
        });
    }

    public void setBrush(Brush brush) {
        this.brush = brush;
        makeEvent();
    }
}