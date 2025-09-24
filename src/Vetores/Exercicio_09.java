package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_09 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[]nome = new String[n];
        double[]compra = new double[n];
        double[]venda = new double[n];

        int menor10 = 0;
        int entre10e20 = 0;
        int maior20 = 0;

        double totalCompra = 0;
        double totalVenda = 0;

        for (int i=0; i<n; i++){
            sc.nextLine();
            nome[i] = sc.nextLine();
            compra[i] = sc.nextDouble();
            venda[i] = sc.nextDouble();

            double percentual = ((venda[i] - compra[i]) / compra[i]) * 100;

            if (percentual < 10){
                menor10++;
            } else if (percentual <= 20) {
                entre10e20++;
            }else {
                maior20++;
            }

            totalCompra += compra[i];
            totalVenda += venda[i];
        }

        double total = totalVenda - totalCompra;

        System.out.println("Mercadorias com lucro < 10%: " + menor10);
        System.out.println("Mercadorias com lucro entre 10% e 20%: " + entre10e20);
        System.out.println("Mercadorias com lucro > 20%: " + maior20);
        System.out.printf("Valor total de compra: R$ %.2f\n", totalCompra);
        System.out.printf("Valor total de venda: R$ %.2f\n", totalVenda);
        System.out.printf("Lucro total: R$ %.2f\n", total);

        sc.close();
    }
}
