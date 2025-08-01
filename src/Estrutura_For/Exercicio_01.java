package Estrutura_For;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor interio: ");
        int X = sc.nextInt();

        for (int i=1; i<X; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
