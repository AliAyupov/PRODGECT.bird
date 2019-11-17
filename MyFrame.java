import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private int num=0;
    private Flock f;
    public MyFrame(Flock f){
        this.f=f;
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Окно открыто");
    }

    public void paint(Graphics g){
        num++;

        if (num==1) {
            g.translate(getWidth() / 2, getHeight() / 2);
            g.drawLine(-50, 0, 50, 0);
            g.drawLine(0, -50, 0, 50);
            g.translate(-getWidth() / 2, -getHeight() / 2);
            f.draw(g);
        }
    }

}
