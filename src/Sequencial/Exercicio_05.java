package Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o codigo da peça: ");
        int peca1 = sc.nextInt();
        System.out.print("Digite a quantidade da peças que deseja: ");
        int qte1 = sc.nextInt();
        System.out.print("Digite o valor unitario da peça: ");
        double valor1 = sc.nextDouble();

        System.out.print("Digite o codigo de outra peça: ");
        int peca2 = sc.nextInt();
        System.out.print("Digite a quantidade da peças que deseja: ");
        int qte2 = sc.nextInt();
        System.out.print("Digite o valor unitario da peça: ");
        double valor2 = sc.nextDouble();

        double total = (qte1 * valor1) + (qte2 * valor2);
        System.out.printf("Valor a pagar: R$ %.2f%n", total);

        sc.close();
    }
}
