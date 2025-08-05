package Orientada_a_Objetos.Entities;

public class Rec {

    public double width;
    public   double reight;

    public double area(){
        return width * reight;
    }

    public double perimeter(){
        return 2 * (width + reight);
    }

    public double diagonal() {
        return Math.sqrt(width * width + reight * reight);
    }
}
