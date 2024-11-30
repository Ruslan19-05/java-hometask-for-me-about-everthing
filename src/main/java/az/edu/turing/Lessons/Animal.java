package az.edu.turing.Lessons;

public class Animal {

    private String name;
    private int age;


    public Animal(String dogName,int dogAge){
        this.name=dogName;
        this.age=dogAge;
    }
    public  String getNameDog(){
        return name;
    }

    public  int getAgeDog(){
        return age;
    }
}
