package az.edu.turing.Homework.OOPhomePractic;

public class Car extends Vehicle {

       private int wheels;
        private int doors;

    public Car(double speed, String model, String name,int wheels,int doors) {
        super(speed, model, name);
        this.doors=doors;
        this.wheels=wheels;
    }

    public  int getWheels(){
        return wheels;
    }

    public void setWheels(int wheels){
        this.wheels=wheels;
    }

    public int getDoors(){
        return doors;
    }

    public void setDoors(int doors){
        this.doors=doors;
    }


    @Override
    public void go(){
        System.out.println("This speed "+getSpeed()+" km/hour");
    }
    @Override
    public void stop(){
        System.out.println("This car is stop");
    }


    public String toString(){
        return getSpeed()+"<"+getModel()+"<"+getName()+"<"+wheels+"<"+doors;
    }
}
