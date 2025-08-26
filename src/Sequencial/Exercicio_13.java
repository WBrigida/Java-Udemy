package Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica: ");
        int N = sc.nextInt();

        int horas = N / 3600;
        int minutos = (N % 3600) / 60;
        int segundos = N % 60;

        System.out.printf("%d:%d:%d\n",horas, minutos, segundos);

        sc.close();
    }
}
