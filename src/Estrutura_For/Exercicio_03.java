package Estrutura_For;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de teste que vem a seguir: ");
        int N = sc.nextInt();

        for (int i=0; i<N; i++){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10;

            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
