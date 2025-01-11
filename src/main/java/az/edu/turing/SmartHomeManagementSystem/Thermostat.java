package az.edu.turing.SmartHomeManagementSystem;

public class Thermostat extends Device{

    private int temperature;

    public Thermostat(int id,String name,DeviceType deviceType){
        super(id,name,deviceType);
    }

    @Override
    public void turnOn(){

    }

    @Override
    public void turnOff(){

    }

    public int getTemperature(){
        return temperature;
    }

    public void setTemperature(int temperature){
        this.temperature=temperature;
        System.out.println(getName() + " tempurature: " + temperature + " become °C.");

    }
}
