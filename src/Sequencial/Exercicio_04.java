package Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the employee number: ");
        int number = sc.nextInt();
        System.out.print("enter number of hours worked: ");
        int hours = sc.nextInt();
        System.out.print("enter the amount you earn per hour: ");
        double value = sc.nextDouble();

        double salary = hours * value;
        System.out.println("Number = " + number);
        System.out.printf("Salary = %.2f%n", salary);

        sc.close();

    }
}
