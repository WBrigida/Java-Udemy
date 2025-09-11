package Estrutura_For;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 11;
        for (int i=1; i<x; i++){
            int vezes;
            vezes = i * n;
            System.out.println(i + " x " + n + " = " + vezes);
        }
        sc.close();
    }
}
