package az.edu.turing.SmartHomeManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class SmartHome implements Manageable {

    private List<User> users;
    private List<Device> devices;

    public SmartHome() {
        this.users = new ArrayList<>();
        this.devices = new ArrayList<>();
    }

    public void addUser(User user) {

       // user.add(user);
        System.out.println(user.getFirstName()+ " add system");
    }

    public void removeUser(User user) {

        users.remove(user);
        System.out.println(user.getFirstName() + " deleted in system");

    }

    public void addDevice(Device device) {
        devices.add(device);
        System.out.println(device.getName() + " add device in system");

    }

    public void removeDevice(Device device) {

        devices.remove(device);
        System.out.println(device.getName() + " device deleted in system.");

    }

    public Device getDeviceStatus(int id) {

        for (Device device : devices) {
            if (device.getStatus()) {
                System.out.println(device.getName() + " is open.");
            } else {
                System.out.println(device.getName() + " is closed.");
            }
        }

        return null;
    }

//    @Override
//    void addDevice(Device device){
//
//
//    }
//
//    @Override
//    void removeDevice(Device device){
//
//
//    }
}
