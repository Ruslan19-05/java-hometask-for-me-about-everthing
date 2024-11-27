package az.edu.turing.OOP;

public class CarApp {

    public static void main(String[] args) {

        Car mercedes=new Car("mersedes","Color",300);
        Car tesla=new Car("tesla","black",10);
        mercedes.model="BMW";
        System.out.println(mercedes);
    }
}
