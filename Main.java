import javax.swing.*;
import java.sql.Time;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Bird.Ggdate();
        Scanner in = new Scanner(System.in);
        Flock f1 = new Flock();
        MyFrame x =new MyFrame(f1);
        in.close();
    }
}
