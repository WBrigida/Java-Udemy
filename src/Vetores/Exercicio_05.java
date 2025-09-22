package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[]vet = new int[n];
        int soma = 0;
        int quantidade = 0;
        for (int i=0; i<n; i++) {
            vet[i] = sc.nextInt();
            if (vet[i] % 2 == 0) {
                soma += vet[i];
                quantidade++;
            }
        }
        if (quantidade > 0){
            double media = (double) soma / quantidade;
            System.out.println(media);
        }

        sc.close();
    }
}
