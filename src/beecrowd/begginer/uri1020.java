package beecrowd.begginer;

import java.util.Scanner;

public class uri1020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int diasInteiros = scan.nextInt();
        int anos = diasInteiros/365;
        diasInteiros -= anos * 365;
        int meses = diasInteiros/30;
        diasInteiros -= meses * 30;
        int dias = diasInteiros;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}
