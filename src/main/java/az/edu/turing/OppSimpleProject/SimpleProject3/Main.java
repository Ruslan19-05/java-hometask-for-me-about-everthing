package az.edu.turing.OppSimpleProject.SimpleProject3;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        Car car1=new Car("RnageRover","Sport",1235,4);
        Motorcycle bike1=new Motorcycle("Merceds","Fantamaz",76585,890);

        ArrayList<Vehicle> vehicles=new ArrayList<>();
        vehicles.add(car1);
        vehicles.add(bike1);

        car1.setNumberOfDoors(2);
        for(Vehicle vehicle:vehicles){
            vehicle.displayInfo();
            System.out.println();
        }
    }
}
