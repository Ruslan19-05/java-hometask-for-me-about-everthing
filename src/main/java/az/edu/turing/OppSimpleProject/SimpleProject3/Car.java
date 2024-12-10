package az.edu.turing.OppSimpleProject.SimpleProject3;

public class Car extends Vehicle{

    private int numberOfDoors;

    public Car(String make,String model,int number,int numberOfDoors){
        super(make,model,number);
        this.numberOfDoors=numberOfDoors;
    }

    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors=numberOfDoors;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("DoorsCount:"+numberOfDoors);
    }
}
