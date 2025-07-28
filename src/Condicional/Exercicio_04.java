package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora inicial: ");
        int horaInicial = sc.nextInt();
        System.out.print("Digite a hora final: ");
        int horaFinal = sc.nextInt();

        int duracao;
        if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
            System.out.println("O jogo durou " + duracao + " Hora(s)");
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
            System.out.println("O jogo durou " + duracao + " Hora(s)");
        }

        sc.close();
    }
}
