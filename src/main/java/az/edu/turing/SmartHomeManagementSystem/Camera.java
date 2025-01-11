package az.edu.turing.SmartHomeManagementSystem;

public class Camera extends  Device{

    public Camera(int id,String name,DeviceType deviceType){

        super(id,name,deviceType);
    }

    @Override
    public void turnOn(){

    }

    @Override
    public void turnOff(){

    }

    public void startRecording(){

        System.out.println(getName()+" start recording");
    }

    public void stopRecording(){

        System.out.println(getName()+" stop recording");
    }
}
