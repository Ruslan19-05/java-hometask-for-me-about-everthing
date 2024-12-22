package az.edu.turing.Quiz5;

public class Student extends Person {

        private String university = "BDU";
        public void introduce() {
            System.out.println("I study at " + university);
        }

    public Student(String name, String university) {
        super(name);
        this.university = university;
    }
}
