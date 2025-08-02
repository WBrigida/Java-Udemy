package Estrutura_For;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            if (n % i == 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
