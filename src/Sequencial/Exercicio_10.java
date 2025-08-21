package Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois valores correspondentes aos eixos x e y de dois pontos quaisquer no plano:");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Digite mais dois valores correspondentes aos eixos x e y de dois pontos quaisquer no plano:");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f%n", distancia);

        sc.close();
    }
}
