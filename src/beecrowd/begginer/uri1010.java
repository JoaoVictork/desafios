package beecrowd.begginer;

import java.util.Scanner;

public class uri1010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int codPeca1 = scan.nextInt();
        int numPeca1 = scan.nextInt();
        double valUnitPeca1 = scan.nextDouble();
        int codPeca2 = scan.nextInt();
        int numPeca2 = scan.nextInt();
        double valUnitPeca2 = scan.nextDouble();
        double prod1 = numPeca1 * valUnitPeca1;
        double prod2 = numPeca2 * valUnitPeca2;
        double valFinal = prod1 + prod2;
        System.out.printf("VALOR A PAGAR: R$ %.2f",valFinal);
        System.out.println();
    }
}
