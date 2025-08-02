package Estrutura_For;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor para achar o fatorial: ");
        int N = sc.nextInt();

        int fat = 1;
        for (int i=1; i<=N; i++){
            fat *= i;
        }
        System.out.println(fat);

        sc.close();
    }
}
