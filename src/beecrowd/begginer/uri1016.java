package beecrowd.begginer;

import java.util.Scanner;

public class uri1016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int distancia = scan.nextInt();
        int tempoDistancia = distancia * 2;

        System.out.println(tempoDistancia + " minutos");

        scan.close();
    }
}
