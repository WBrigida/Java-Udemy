package Matrizes;

import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        int girar = sc.nextInt() - 1;

        int ultimo = matriz[girar][n - 1];
        for (int j=n-1; j>0; j--){
            matriz[girar][j] = matriz[girar][j-1];
        }
        matriz[girar][0] = ultimo;

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        sc.nextInt();
    }
}
