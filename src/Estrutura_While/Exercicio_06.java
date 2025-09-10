package Estrutura_While;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int opcao;
        do {
            System.out.print("Digite quantos gols o Inter fez: ");
            int inter = sc.nextInt();
            System.out.print("Digite quantos gols o Gremio fez: ");
            int gremeio = sc.nextInt();

            System.out.println("Novo grenal (1-sim 2-nao)");
            opcao = sc.nextInt();
        } while (opcao != 1 && opcao != 2);
    }
}
