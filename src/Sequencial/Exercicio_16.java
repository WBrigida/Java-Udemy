package Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_16 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro correspondente à idade de uma pessoa: ");
        int x = sc.nextInt();

        int anos = x / 365;
        int diasRestantes = x % 365;
        int meses = diasRestantes/ 30;
        int dias = diasRestantes % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        sc.close();
    }
}
