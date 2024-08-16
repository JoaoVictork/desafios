package beecrowd.begginer;

import java.util.Scanner;

public class uri1017 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tempoViagem = scan.nextInt();
        int velMedia = scan.nextInt();

        double distPercorrida = tempoViagem * velMedia;
        double combGastoViagem = distPercorrida / 12;
        System.out.printf("%.3f%n",combGastoViagem);
        scan.close();
    }
}
