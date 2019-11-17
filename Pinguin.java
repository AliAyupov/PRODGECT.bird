import java.awt.*;
import java.util.Random;

public class Pinguin extends Bird {
    private static int num=0;
    public Pinguin() {
        num++;
        System.out.println("Я пингвин №" + num + "!");
    }
        protected int size=50;

        public void draw(Graphics g){
            Color color = Color.blue;
            size = 50;
            int min = 50;
            int max = 450;
            int diff = max - min;
            Random random = new Random();
            int x = random.nextInt(diff )+1;
            x = x + min;
            int diff1 = max - min;
            int y = random.nextInt(diff1)+1 ;
            y = y + min;
            g.setColor(color);
            g.fillOval(x,y,size,size);
            x = x + 20;
            y = y + 10;
            color = Color.white;
            size = 15;
            g.setColor(color);
            g.fillOval(x,y,size,size);
    }
}
