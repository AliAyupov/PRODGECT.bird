import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import static java.lang.Integer.valueOf;
import java.text.SimpleDateFormat;

public class Sparrow extends Bird {
    private static int num=0;
    public Sparrow() {
        num++;
        System.out.println("Я воробей №" + num + "!");

    }
}


