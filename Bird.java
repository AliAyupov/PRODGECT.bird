import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import static java.lang.Integer.valueOf;

public abstract class Bird {

    public void draw(Graphics g) {

        int min = z;
        int max = m;
        int diff = max - min;
        Random random = new Random();
        int x = random.nextInt(diff )+1;
        x = x + min;
        int y = random.nextInt(diff )+1;
        y = y + min;
        g.setColor(Flock.color);
        g.fillOval(x, y, size, size);
    }


    static int num = 0;
    public static void Ggdate(){
        Calendar time1 = Calendar.getInstance();
        long t = time1.get(Calendar.HOUR_OF_DAY);
        if (22 <= t && t < 6) {
            System.out.println("сейчас ночь");
        }
        if (6 <= t && t < 12) {
            System.out.println("сейчас утро");
        }
        if (12 <= t && t < 18) {
            System.out.println("сейчас день");
        }
        if (18 <= t && t < 22) {
            System.out.println("сейчас вечер");
        }
    }

    public  Bird() {
        num++;
        System.out.println("Птица" + num + "!");

    }

    private int z = 50;
    private int m = 450;

    private Color color=Color.green;
    private int size=50;


}

