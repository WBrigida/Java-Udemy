package Estrutura_For;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor interio positivo: ");
        int N = sc.nextInt();

        for (int i=1; i<=N; i++){

            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }

        sc.close();
    }
}
