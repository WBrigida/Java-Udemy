package Estrutura_For;

import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int total = 0;
        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;

        for (int i = 0; i < N; i++) {
            int quantia = scanner.nextInt();
            char tipo = scanner.next().charAt(0);

            total += quantia;

            switch (tipo) {
                case 'C':
                    coelhos += quantia;
                    break;
                case 'R':
                    ratos += quantia;
                    break;
                case 'S':
                    sapos += quantia;
                    break;
            }
        }

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);

        System.out.printf("Percentual de coelhos: %.2f %%\n", (coelhos * 100.0) / total);
        System.out.printf("Percentual de ratos: %.2f %%\n", (ratos * 100.0) / total);
        System.out.printf("Percentual de sapos: %.2f %%\n", (sapos * 100.0) / total);
    }
}
