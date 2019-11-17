import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Flock {
    private ArrayList<Bird> f = new ArrayList<>();
    public static Color color;
    public Flock() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; ; i++) {
            System.out.println("Введите число: 1 - Попугай, 2 - Пингвин, 3 - Воробей, 4 - Выход");
            int n = in.nextInt();
            if (n == 1)
                f.add(new Macaw());
            if (n == 2)
                f.add(new Pinguin());
            if (n == 3)
                f.add(new Sparrow());
            if (n != 1 && n != 2 && n != 3)
                break;
        }
    }
    public void draw(Graphics g) {
        for (int i = 0; i < f.size(); i++) {
            if (f.get(i) instanceof Macaw) {
                color = Color.red;
            }
            if (f.get(i) instanceof Sparrow) {
                color = Color.gray;
            }
            f.get(i).draw(g);
        }
    }
}

