package Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double R = sc.nextInt();

        double PI = 3.14159;
        double volume = (4.0/ 3.0) * PI * R * R * R;

        System.out.printf("Volume = %.3f%n", volume);

        sc.close();

    }
}
