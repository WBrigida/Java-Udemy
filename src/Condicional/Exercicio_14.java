package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora inicial, minuto inicial, hora final e minuto final de um jogo:");
        int horaInicial = sc.nextInt();
        int minInicical = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minFinal = sc.nextInt();

        int inicio = horaInicial * 60 + minInicical;
        int fim = horaFinal * 60 + minFinal;

        if (fim <= inicio){
            fim += 24 * 60;
        }

        int duracaoTotal = fim - inicio;
        int horas = duracaoTotal / 60;
        int minutos = duracaoTotal % 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);

        sc.close();
    }
}
