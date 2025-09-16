package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] vet = new int[n];
        for (int i=0; i<n; i++){
            vet[i] = sc.nextInt();
        }
        int quantidade = 0;
        for (int i=0; i<n; i++){
            if (vet[i] % 2 == 0){
                System.out.print(vet[i] + " ");
                quantidade++;
            }
        }
        System.out.println();
        System.out.println(quantidade);

        sc.close();
    }
}
