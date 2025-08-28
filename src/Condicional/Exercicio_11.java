package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 valores inteiros");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int menor, meio, maior;

        if (a <= b && a <= c ) {
            menor = a;
            if (b <= c){
                meio = b;
                maior = c;
            }
            else {
                meio = c;
                maior = b;
            }
        } else if (b <= a && b <= c) {
            menor = b;
            if (a <= c){
                meio = a;
                maior = c;
            }
            else {
                meio = c;
                maior = a;
            }
        }else {
            menor = c;
            if (a <= b){
                meio = a;
                maior = b;
            }
            else {
                meio = b;
                maior = a;
            }
        }
        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);

        System.out.println();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        sc.close();
    }
}
