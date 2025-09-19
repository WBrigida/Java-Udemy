package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[]veta = new int[n];
        int[]vetb = new int[n];
        for (int i=0; i<n; i++){
            veta[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++){
            vetb[i] = sc.nextInt();
        }
        int[]vetc = new int[n];
        for (int i=0; i<n; i++){
            vetc[i] = veta[i] + vetb[i];
            System.out.println(vetc[i]);
        }
        sc.close();
    }
}
