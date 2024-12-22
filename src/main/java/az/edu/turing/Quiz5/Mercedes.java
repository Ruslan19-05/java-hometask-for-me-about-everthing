package az.edu.turing.Quiz5;

public class Mercedes extends  Car{

    private String model;
    public Mercedes(String model, String color) {
        super(color);
        this.model = model;
    }
    public String toString() {
        return "model: " + model + ", " + super.toString();
    }
}
