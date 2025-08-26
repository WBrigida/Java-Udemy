package Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int x = sc.nextInt();
        System.out.println(x);

        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        for (int nota: notas){
            int quantidade = x / nota;
            System.out.println(quantidade + " nota(s) de R$ " + nota + ",00");
            x %= nota;
        }

        sc.close();
    }
}
