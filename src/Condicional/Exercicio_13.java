package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite valores de ponto flutuante A, B e C:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double A, B, C;
        if (a >= b && a >= c){
            A = a;
            if (b >= c){
                B = b;
                C = c;
            }else {
                B = c;
                C = b;
            }
        } else if (b >= a && b >= c) {
            A = b;
            if (a >= c) {
                B = a;
                C = c;
            } else {
                B = c;
                C = a;
            }
        } else {
            A = c;
            if (a >= b) {
                B = a;
                C = b;
            } else {
                B = b;
                C = a;
            }
        }

        if (A >= B + C){
            System.out.println("NAO FORMA TRIANGULO");
        }else {
            if (A * A == B * B + C * C){
                System.out.println("TRIANGULO RETANGULO");
            } else if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C || A == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        sc.close();
    }
}
