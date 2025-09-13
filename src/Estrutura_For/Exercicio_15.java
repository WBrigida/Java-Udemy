package Estrutura_For;

import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int contador = 1;

        if (n > 1 && n < 1000){
           for (int i = 0; i < n; i++) {
            System.out.printf("%d %d %d\n", contador, contador * contador, contador * contador * contador);
            contador++;
           }
        }
        sc.close();
    }
}
