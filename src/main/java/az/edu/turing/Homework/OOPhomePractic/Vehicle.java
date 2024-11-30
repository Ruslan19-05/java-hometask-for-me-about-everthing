package az.edu.turing.Homework.OOPhomePractic;

public class Vehicle {

    private double speed;
    private String model;
    private String name;

    public Vehicle(double speed,String model,String name){
        this.speed=speed;
        this.model=model;
        this.name=name;
    }

    public  double getSpeed(){
        return speed;
    }

    public void setSpeed(double speed){
        this.speed=speed;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model=model;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public  void  go(){
        System.out.println("This vehicle is moving");
    }

    public void stop(){
        System.out.println("This vehicle is stop");
    }

    public String toString(){
        return speed+","+model+","+name;
    }
}
