package Server.UI;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

import Client.Send;
import Server.ServerController;

public class ChatInputTextField extends JTextField {
    public ChatInputTextField() {
        setBounds(10,360,480,30);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }
}
