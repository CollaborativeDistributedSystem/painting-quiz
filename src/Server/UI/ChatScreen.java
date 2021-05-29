package Server.UI;

import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JTextArea;


public class ChatScreen extends JTextArea {
    public ChatScreen(){
        setBounds(10, 150, 500 , 300);
        this.setDisabledTextColor(Color.GRAY);
        setBorder(BorderFactory.createLineBorder(Color.MAGENTA, 1));
        setEnabled(false);
    }
}
