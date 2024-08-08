package beecrowd.begginer;

import java.util.Scanner;

public class uri1002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = 3.14159;
        double raio = scan.nextDouble();
        double area = n * (raio * raio);

        System.out.printf("A=%.4f",area);
        System.out.println();
        scan.close();
    }
}

