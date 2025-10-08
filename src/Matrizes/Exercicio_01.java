package Matrizes;

import java.util.Scanner;

public class Exercicio_01 {
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
        System.out.println("Numeros Negativos:");
        for (int i=0; i<m; i++) {
            for (int j = 0; j<n; j++){
                if (matriz[i][j] < 0){
                    System.out.println(matriz[i][j]);
                }
            }
        }
        sc.close();
    }
}
