package Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias: ");
        int idade = sc.nextInt();

        int anos = idade / 365;
        int meses = (idade % 365) / 30;
        int dias = idade % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        sc.close();
    }
}
