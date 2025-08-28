package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 valores reais:");
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        if (A + B > C && A + C > B && B + C > A){
            double perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } else {
            double area = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f%n", area);
        }
        sc.close();
    }
}
