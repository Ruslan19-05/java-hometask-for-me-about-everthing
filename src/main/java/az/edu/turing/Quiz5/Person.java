package az.edu.turing.Quiz5;

public class Person {

    private String name;
    public Person(String name) {
        this.name = name;
    }
    public boolean equals(Object object) {
        if (object instanceof Person) {
            Person person = (Person) object;
            return this.name.equals(person.name);
        }
        return false;
    }
}
