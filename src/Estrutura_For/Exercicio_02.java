package Estrutura_For;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores deseja digitar? ");
        int N = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i=0; i<N; i++){
            int X = sc.nextInt();
            if (X >= 10 && X <= 20){
                in += 1;
            }
            else {
                out += 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}
