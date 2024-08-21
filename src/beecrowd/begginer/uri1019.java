package beecrowd.begginer;

import java.util.Scanner;

public class uri1019 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int segundosInteiros = scan.nextInt();
        int horas = segundosInteiros / 3600;
        segundosInteiros -= horas * 3600;
        int minutos = segundosInteiros / 60;
        segundosInteiros -= minutos * 60;
        int segundos = segundosInteiros;
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
