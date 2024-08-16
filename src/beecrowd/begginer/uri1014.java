package beecrowd.begginer;

import java.util.Scanner;

public class uri1014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        double y = scan.nextDouble();

        double consMedio = x/y;

        System.out.printf("%.3f km/l%n",consMedio);
        scan.close();
    }
}
