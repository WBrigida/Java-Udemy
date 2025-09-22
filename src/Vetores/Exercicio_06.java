package Vetores;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[n];
        int[] vet = new int[n];

        for (int i=0; i<n; i++){
            nome[i] = sc.nextLine();
            vet[i] = sc.nextInt();
            sc.nextLine();
        }
        int maisVelha = 0;
        for (int i=1; i<n; i++){
            if (vet[i] > vet[maisVelha]){
                maisVelha = i;
            }
        }
        System.out.println("Pessoa mais velha: " + nome[maisVelha]);

        sc.close();
    }
}
