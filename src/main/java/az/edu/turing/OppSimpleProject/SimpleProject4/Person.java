package az.edu.turing.OppSimpleProject.SimpleProject4;

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void displayInfo(){
        System.out.println("Name:"+name+"\n"+"Age:"+age);
    }

    @Override
    public String toString(){
        return name+" "+age;
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || getClass()!=o.getClass()) return false;
        Person person=(Person)o;
        return Objects.equals(name,person.name) && age==person.age;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,age);
    }
}
