package beecrowd.begginer;

import java.util.Scanner;

public class uri1012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pi = 3.14159;
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double areaTriRet = (a * c)/2;
        double areaCircRaio = pi*(c*c);
        double areaTrap = ((a+b)*c)/2;
        double areaQuad = b*b;
        double areaRet = a * b;

        System.out.printf("TRIANGULO: %.3f%n",areaTriRet);
        System.out.printf("CIRCULO: %.3f%n",areaCircRaio);
        System.out.printf("TRAPEZIO: %.3f%n",areaTrap);
        System.out.printf("QUADRADO: %.3f%n",areaQuad);
        System.out.printf("RETANGULO: %.3f%n",areaRet);
    }
}
