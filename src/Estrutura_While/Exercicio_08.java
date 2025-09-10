package Estrutura_While;

import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        while (true){
            int x = sc.nextInt();
            if (x == 0){
                break;
            }
            if (x % 2 != 0){
                x++;
            }
            int soma = 0;
            for (int i = 0; i< 5; i++){
                soma += x + (i * 2);
            }
            System.out.println(soma);
        }
        sc.close();
    }
}
