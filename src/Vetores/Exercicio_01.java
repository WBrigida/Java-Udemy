package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros Diferentes voce vai digitar? ");
        int x = sc.nextInt();

        double[] vect = new double[x];

        for (int i=0; i<x; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        System.out.println("Maior numero:");
        double maior = 0.0;
        for (int i=0; i<x; i++){

        }
    }

}
