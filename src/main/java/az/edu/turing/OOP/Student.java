package az.edu.turing.OOP;

public class Student {
   private String name;
   private String model;
    private int age;


    Student (String name,String model,int age){
        this.name=name;
        this.setModel(model);
        this.age=age;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model=model;
    }

    public  String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }
}
