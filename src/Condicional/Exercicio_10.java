package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite suas 4 notas:");
        float N1 = sc.nextFloat();
        float N2 = sc.nextFloat();
        float N3 = sc.nextFloat();
        float N4 = sc.nextFloat();

        float media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10;
        System.out.printf("Media: %.1f%n", media);

        if (media >= 7.0){
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        }else {
            if (media >= 5.0 && media <= 6.9){
                System.out.println("Aluno em exame.");
                float nota = sc.nextFloat();
                System.out.printf("Nota do exame: %.1f%n", nota);

                float media2 = (nota + media) / 2;

                if (media2 >= 5.0){
                    System.out.println("Aluno aprovado.");
                }else {
                    System.out.println("Aluno reprovado.");
                }
                System.out.printf("Media final: %.1f%n", media2);
            }
        }
        sc.close();
    }
}
