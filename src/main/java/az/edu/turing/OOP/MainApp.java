package az.edu.turing.OOP;

import java.sql.SQLOutput;

public class MainApp {

    public static void main(String[] args) {

        Human human=new Human("Ruslan",19,6789);
        Human teacher=new Teacher("Messi",37,100000,"Football");
        Human engineer=new Engineer("JakPol",29,555443543,5);

        System.out.println(teacher instanceof Teacher);

        System.out.println(teacher.toString());

    }
}
