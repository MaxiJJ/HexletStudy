import java.util.Scanner;

public class MaxTask1 {
    public static void main(String[] args) {
        //Scanner
        //read radius from console
        int radius = 5;
        double pi = 3.14;
        double S = pi * Math.pow(radius, 2);
        double P = (2 * pi * radius);
//        System.out.printf("%.2f\n", P);
        System.out.print("Square = " + S + " Perimeter = " + Math.rint(100.0 * P) / 100.0);
    }
}
