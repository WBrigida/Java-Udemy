package Estrutura_While;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int opcao;

        System.out.println("Digite as notas referentes às duas avaliações de um aluno:");
        do {
            double nota1 = 0, nota2 = 0;
            int notasValidas = 0;

            while (notasValidas < 2) {
                double nota = sc.nextDouble();
                if (nota >= 0 && nota <= 10) {
                    if (notasValidas == 0) {
                        nota1 = nota;
                    } else {
                        nota2 = nota;
                    }
                    notasValidas++;
                } else {
                    System.out.println("nota invalida");
                }
            }

            double media = (nota1 + nota2) / 2;
            System.out.printf("media = %.2f%n", media);

            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                opcao = sc.nextInt();
            } while (opcao != 1 && opcao != 2);

        } while (opcao == 1);

        sc.close();
    }
}
