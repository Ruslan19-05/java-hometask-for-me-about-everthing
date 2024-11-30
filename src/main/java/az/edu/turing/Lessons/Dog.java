package az.edu.turing.Lessons;

public class Dog extends Animal {


    private String color;


    public Dog(String name,int age,String color){
        super(name,age);
        this.color=color;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }
}
