package Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 valores:");
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double PI = 3.14159;

        double tri = A * C / 2;
        double cir = PI * C * C;
        double tra = (A +B) / 2 * C;
        double qua = B * B;
        double ret = A * B;

        System.out.printf("TRIANGULO: %.3f%n" , tri);
        System.out.printf("CIRCULO: %.3f%n" , cir);
        System.out.printf("TRAPEZIO: %.3f%n" , tra);
        System.out.printf("QUADRADO: %.3f%n" , qua);
        System.out.printf("RETANGULO: %.3f%n" , ret);

        sc.close();
    }
}
