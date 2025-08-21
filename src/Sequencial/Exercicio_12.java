package Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem: ");
        int tempo = sc.nextInt();
        System.out.print("Digite a velocidade media durante a mesma: ");
        int velocidade = sc.nextInt();

        int distancia = tempo * velocidade;
        double quantidade = distancia / 12.0;

        System.out.printf("%.3f%n", quantidade);

        sc.close();
    }
}
