package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[]nome = new String[n];
        double[]nap1 = new double[n];
        double[]nap2 = new double[n];

        for (int i=0; i<n; i++){
            nome[i] = sc.nextLine();
            nap1[i] = sc.nextDouble();
            nap2[i] = sc.nextDouble();
            sc.nextLine();
            }

        System.out.println("\nAlunos aprovados:");
        for (int i=0; i<n; i++){
            double media = (nap1[i] + nap2[i]) / 2.0;
            if (media >= 6.0){
                System.out.println(nome[i]);
            }
        }
        sc.close();
    }
}
