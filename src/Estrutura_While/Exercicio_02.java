package Estrutura_While;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano");
        int X = sc.nextInt();
        int Y = sc.nextInt();

        while (X != 0 && Y != 0){
            if (X > 0 && Y > 0){
                System.out.println("primeiro");
            } else if (X < 0 && Y > 0) {
                System.out.println("segundo");
            } else if (X < 0 ) {
                System.out.println("terceiro");
            }
            else{
                System.out.println("quarto");
            }
            X = sc.nextInt();
            Y = sc.nextInt();
        }
        sc.close();
    }
}
