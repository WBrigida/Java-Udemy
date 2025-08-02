package Estrutura_For;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores inteiros gostaria de digitar? ");
        int N = sc.nextInt();

        for (int i=0; i<N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (y==0){
                System.out.println("Divisao impossivel");
            }
            else {
                double divisao = (double) x / y;
                System.out.printf("%.1f%n", divisao);
            }
        }

        sc.close();
    }
}
