package az.edu.turing.SmartHomeManagementSystem;

public class Doorbell extends  Device{

    public Doorbell(int id,String name,DeviceType deviceType){

        super(id,name,deviceType);
    }

    @Override
    public void turnOn(){

    }

    @Override
    public void turnOff(){

    }

    public void ring(){

        System.out.println(getName()+" i ringing");
    }
}
