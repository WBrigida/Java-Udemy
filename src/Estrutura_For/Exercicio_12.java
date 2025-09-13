package Estrutura_For;

import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int posicao = 1;
        for (int i=2; i<=100; i++){
            int x = sc.nextInt();
            if (x > n){
                n = x;
                posicao = i;
            }
        }
        System.out.println(n);
        System.out.println(posicao);
        sc.close();
    }
}
