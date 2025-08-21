package Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite tres valores inteiros: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int maiorAB = (A + B + Math.abs(A - B)) / 2;
        int maior = (maiorAB + C + Math.abs(maiorAB - C)) / 2;

        System.out.printf(maior + " eh o maior");

        sc.close();
    }
}
