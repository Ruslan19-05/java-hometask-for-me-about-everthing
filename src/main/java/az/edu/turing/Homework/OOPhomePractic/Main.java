package az.edu.turing.Homework.OOPhomePractic;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle=new Vehicle(260,"Sport","RangeRover");
        vehicle.go();
        vehicle.stop();
        vehicle.setModel("Audi A8");
        vehicle.setName("AUDI");
        vehicle.setSpeed(500);
        System.out.println(vehicle.toString());
        System.out.println();

        Car car=new Car(400,"Mustang","Ford",4,4);
        car.stop();
        //car.setDoors(2);
        //car.setWheels(12);
        car.setSpeed(600);
        System.out.println(car.toString());
        System.out.println(car.getDoors());
        System.out.println(car.getWheels());
        car.go();
        System.out.println();

        Bicycle bike=new Bicycle(50,"Desna","Salyut",2,2);
        bike.setPedals(6);
        bike.setWheels(4);
        bike.setName("OBSSKA");
        bike.setSpeed(60);
        System.out.println(bike.getPedals());
        System.out.println(bike.getWheels());
        System.out.println(bike.toString());
        bike.go();
        bike.stop();
    }
}
