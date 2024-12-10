package az.edu.turing.OppSimpleProject.SimpleProject3;

import java.util.Objects;

public class Vehicle {

    private String make;
    private String model;
    private int number;

    public Vehicle(String make,String model, int number){
        this.make=make;
        this.model=model;
        this.number=number;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getNumber(){
        return number;
    }

    public void setMake(String make){
        this.make=make;
    }

    public void setModel(String model){
        this.model=model;
    }

    public void setNumber(int number){
        this.number=number;
    }

    public void displayInfo(){
        System.out.println("Make:"+make+"\n"+"Model:"+model+"\n"+"Number:"+number);
    }

    @Override
    public int hashCode(){
        return Objects.hash(make,model,number);
    }
}
