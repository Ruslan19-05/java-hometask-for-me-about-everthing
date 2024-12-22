package az.edu.turing.OOP;

import java.sql.SQLOutput;

public class MainApp {

    public static void main(String[] args) {

        Human human=new Human("Ruslan",19,6789);
        Teacher teacher=new Teacher("Messi",37,100000,"Football");



                System.out.println( human instanceof Teacher);
                System.out.println(teacher instanceof Human);


    }
}
