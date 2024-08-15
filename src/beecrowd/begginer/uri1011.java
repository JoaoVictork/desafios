package beecrowd.begginer;

import java.util.Scanner;

public class uri1011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pi = 3.14159;
        double raio = scan.nextDouble();
        double volume = (4.0/3) * pi * (raio*raio*raio);
        System.out.printf("VOLUME = %.3f",volume);
        System.out.println();
    }
}
