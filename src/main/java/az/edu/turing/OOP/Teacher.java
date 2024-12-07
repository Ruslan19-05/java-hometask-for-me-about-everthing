package az.edu.turing.OOP;

public class Teacher extends Human{

    private String subject;

//    public Teacher(String subject){
//        this.subject=subject;
//    }
    public Teacher(String name, int age, double salary, String subject) {
        super(name, age, salary);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
