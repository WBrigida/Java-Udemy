package Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_09 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor distância total percorrida: ");
        int X = sc.nextInt();
        System.out.print("Digite o total de combustível gasto: ");
        double Y = sc.nextDouble();

        double consumo = X / Y;

        System.out.printf("%.3f km/l%n", consumo);

        sc.close();
    }
}
