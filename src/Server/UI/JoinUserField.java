package Server.UI;


import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class JoinUserField extends JTextField {
    public JoinUserField() {
        super("Connected User : ");
        setBounds(10,70,480,30);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.setDisabledTextColor(Color.BLACK);
        setEnabled(false);
    }
}
