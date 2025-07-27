package Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio de um círculo: ");
        double raio = sc.nextDouble();

        double PI = 3.14159;
        double area = PI * raio * raio;
        System.out.printf("Area do circulo: %.4f%n", area);

        sc.close();
    }
}
