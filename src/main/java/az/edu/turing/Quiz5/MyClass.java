package az.edu.turing.Quiz5;

public class MyClass implements A,B{

    @Override
    public void show(){
        System.out.println("Show X");
    }

    @Override
    public void display(){
        show();
        System.out.println("Show Y");
    }
}
