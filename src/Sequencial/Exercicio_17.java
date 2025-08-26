package Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor de ponto flutuante com duas casas decimais: ");
        double valor = sc.nextDouble();

        int centavos = (int) Math.round(valor * 100);

        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quantidade = centavos / nota;
            centavos %= nota;
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidade, nota / 100.0);
        }

        int[] moedas = {100, 50, 25, 10, 5, 1};
        System.out.println("MOEDAS:");
        for (int moeda : moedas) {
            int quantidade = centavos / moeda;
            centavos %= moeda;
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade, moeda / 100.0);
        }

        sc.close();
    }
}
