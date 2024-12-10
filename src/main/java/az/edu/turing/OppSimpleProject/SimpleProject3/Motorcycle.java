package az.edu.turing.OppSimpleProject.SimpleProject3;

public class Motorcycle extends Vehicle{

    private int enginieCapacity;

    public Motorcycle(String make,String model,int number,int enginieCapacity){
        super(make,model,number);
        this.enginieCapacity=enginieCapacity;
    }

    public int getEnginieCapacity(){
        return enginieCapacity;
    }

    public void setEnginieCapacity(int enginieCapacity){
        this.enginieCapacity=enginieCapacity;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("EngineCapactiy:"+enginieCapacity);
    }
}
