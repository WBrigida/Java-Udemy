package Orientada_a_Objetos.Aplication;

import java.util.Locale;
import java.util.Scanner;
import Orientada_a_Objetos.Entities.Stu;

public class Student {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Stu stu = new Stu();

        stu.name = sc.nextLine();
        stu.grade1 = sc.nextDouble();
        stu.grade2 = sc.nextDouble();
        stu.grade3 = sc.nextDouble();

        System.out.printf("Final Grade: %.2f%n", stu.finalGrade());

        if (stu.finalGrade() < 60.0){
            System.out.println("Failed");
            System.out.printf("Missing %.2f Points%n", stu.missingPoints());
        }
        else {
            System.out.println("Pass");
        }

        sc.close();
    }
}
