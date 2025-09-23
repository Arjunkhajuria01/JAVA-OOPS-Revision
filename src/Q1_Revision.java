// Create a class Car with fields brand, model, and year. Add a method to display car details.
// Create multiple objects and call the method.

class Car{
    String Brand ;
    String Model;
    String Year;
    public void Info(){
        Brand = "Hyundai";
        Model = "Creta";
        Year = "2010" ;
        System.out.println(Brand);
        System.out.println(Model);
        System.out.println(Year);
    }
}

public class Q1_Revision {
    public static void main(String[] args) {
 Car cr = new Car();
 cr.Info();
    }
}
