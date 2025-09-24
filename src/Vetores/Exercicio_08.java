package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[]altura = new double[n];
        char[] sexo = new char[n];

        for (int i=0; i<n; i++){
            altura[i] = sc.nextDouble();
            sexo[i] = sc.next().toUpperCase().charAt(0);
        }
        double maior = altura[0];
        double menor = altura [0];
        double soma = 0;
        int muler = 0;
        int homem = 0;

        for (int i=0; i<n; i++){
            if (altura[i] > maior) maior = altura[i];
            if (altura[i] < menor) menor = altura[i];

            if (sexo[i] == 'F'){
                soma += altura[i];
                muler++;
            } else if (sexo[i] == 'M') {
                homem++;
            }
        }

        double media = muler > 0 ? soma / muler: 0;

        System.out.printf("Maior altura do grupo = %.2f%n", maior);
        System.out.printf("Menor altura do grupo = %.2f%n", menor);
        System.out.printf("Média de altura das mulheres = %.2f%n", media);
        System.out.println("Número de homens= " + homem);

        sc.close();
    }
}
