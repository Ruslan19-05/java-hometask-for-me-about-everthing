package az.edu.turing.quiz9_10;

public class Person1 implements  Comparable<Person1>{

    private String name;
    private int age;
    private double weight;

    public Person1(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Person1 that) {
        return this.age- that.age;
    }

    @Override
    public String toString() {
        return "{" + name + " " + age + " " + weight + "}";
    }
}
