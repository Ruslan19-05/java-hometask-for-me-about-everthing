package az.edu.turing.ProjectFamilyApp;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        Human father = new Human("John", "Smith", 1965);
        Human mother = new Human("Anna", "Smith", 1970);

        Human child = new Human("Jack", "Smith", father,mother);

        System.out.println("Father: " + father);
        System.out.println("Mother: " + mother);
        System.out.println("Child: " + child);




    }
}
