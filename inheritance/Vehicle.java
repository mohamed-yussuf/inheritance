package inheritance;

public class Vehicle {
    String brand = "Ford";
    public void honk(){
        System.out.println("Hooooonk Hooooonk!!!");
    }
}

class Car extends Vehicle{
    private final String modelName = "Mustang";

    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.honk();

        System.out.println(myCar.brand+" "+myCar.modelName);
    }
}
