package Estrutura_While;

import java.util.Scanner;

public class Exercicios_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o codigo do combustivel desejado: 1.Álcool 2.Gasolina 3.Diesel 4.Fim");
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int tipo = sc.nextInt();

        while (tipo != 4){
            if (tipo == 1 ){
                alcool ++;
            } else if (tipo == 2) {
                gasolina ++;
            } else if (tipo == 3) {
                diesel ++;
            }
             tipo = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
