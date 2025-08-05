package Orientada_a_Objetos.Entities;

public class Emp {

    public String name;
    public  double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        grossSalary += grossSalary * percentage / 100.0;
    }

    public String toString(){
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}
