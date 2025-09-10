package Estrutura_While;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int contador = 0;

        while (true){
            int idade = sc.nextInt();
            if (idade < 0){
                break;
            }
            soma += idade;
            contador++;
        }
        if (contador > 0){
            double media = (double) soma / contador;
            System.out.printf("%.2f%n", media);
        }else {
            System.out.println("Nenhuma idade valida foi informada");
        }
        sc.close();
    }
}
