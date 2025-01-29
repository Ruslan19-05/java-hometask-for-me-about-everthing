package az.edu.turing.comparable;

public class Person implements Comparable<Person>{
    String name;
    int age;

    public Person (String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age,o.age);
    }

    @Override
    public String toString(){
        return name+"("+age+")";
    }
}
