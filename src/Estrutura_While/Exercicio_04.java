package Estrutura_While;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        double soma= 0;

        System.out.println("Digite as notas referentes às duas avaliações de um aluno:");
        while (contador < 2){
            double nota = sc.nextDouble();

            if (nota >= 0 && nota <= 10){
                soma += nota;
                contador++;
            }else {
                System.out.println("nota invalida");
            }
        }

        double media = soma /2;
        System.out.printf("media = %.2f%n", media);
    }
}
