package Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a distancia: ");
        double distancia = sc.nextInt();

        double minutos = distancia * 2;

        System.out.printf("%.0f minutos%n", minutos);

        sc.close();
    }
}
