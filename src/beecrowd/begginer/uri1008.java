package beecrowd.begginer;

import java.util.Scanner;

public class uri1008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numFuncionario = scan.nextInt();
        int horTrabalhadas = scan.nextInt();
        double salHora = scan.nextDouble();
        double salFinal = salHora * horTrabalhadas;
        System.out.println("NUMBER = "+numFuncionario);
        System.out.printf("SALARY = U$ %.2f",salFinal);
        System.out.println();
    }
}
