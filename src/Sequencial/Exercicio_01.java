package Sequencial;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Digite 2 valores inteiros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int soma = a + b;
        System.out.println("Soma = " + soma);

        sc.close();
    }
}
