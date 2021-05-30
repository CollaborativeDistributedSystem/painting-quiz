package Client.UI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;

import Client.*;

public class Brush extends JLabel {

    private int x;
    private int y;
    public boolean flag = false;
    public Color color = Color.black;

    @Override
    public void paint(Graphics g) {
        if(flag==true) {
            g.setColor(color);
            g.fillOval(x, y , 10, 20);
        }
        else if(flag==false) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 1100, 1100);
            flag = true;
        }
    }





    public void setX(int x) { this.x = x; }

    public void setY(int y) { this.y = y; }

    public void setColor(Color color) { this.color = color; }
    public void setFlag(boolean flag) { this.flag = flag; }
}