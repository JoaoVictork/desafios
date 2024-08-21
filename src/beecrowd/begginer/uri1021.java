package beecrowd.begginer;

import java.util.Scanner;

public class uri1021 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valorInteiro = scan.nextDouble();
        // CÉDULAS //
        double notas100 = valorInteiro/100;
        valorInteiro -= notas100 * 100;
        double notas50 = valorInteiro/50;
        valorInteiro -= notas50 * 50;
        double notas20 = valorInteiro/20;
        valorInteiro -= notas20 * 20;
        double notas10 = valorInteiro/10;
        valorInteiro -= notas10 * 10;
        double notas5 = valorInteiro/5;
        valorInteiro -= notas5 * 5;
        double notas2 = valorInteiro/2;
        valorInteiro -= notas2 * 2;
        // MOEDAS //
        double moeda1 = valorInteiro/1;
        valorInteiro -= moeda1 * 1;
        double moeda50 = valorInteiro/0.50;
        valorInteiro = moeda50 * 0.50;
        double moeda25 = valorInteiro/0.25;
        valorInteiro -= moeda25 * 0.25;
        double moeda10 = valorInteiro/0.10;
        valorInteiro -= moeda10 * 0.10;
        double moeda5 = valorInteiro/0.05;
        valorInteiro -= moeda5 * 0.05;
        double moeda01 = valorInteiro/0.01;

        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda5 + " moeda(s) de R$ 0.05");
        System.out.println(moeda01 + " moeda(s) de R$ 0.01");
    }
}
