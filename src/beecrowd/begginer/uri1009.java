package beecrowd.begginer;

import java.util.Scanner;

public class uri1009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomeVendedor = scan.nextLine();
        double salFixo = scan.nextDouble();
        double vendEfetuadas = scan.nextDouble();
        double comissao = vendEfetuadas * 0.15;
        double salFinal = salFixo + comissao;
        System.out.printf("TOTAL = R$ %.2f", salFinal);
        System.out.println();
    }
}
