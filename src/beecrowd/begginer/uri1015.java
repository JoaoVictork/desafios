package beecrowd.begginer;

import java.util.Scanner;

public class uri1015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y1 - y2,2));

        System.out.printf("%.4f%n",distancia);
    }
}
