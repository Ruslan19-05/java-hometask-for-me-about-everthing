package az.edu.turing.OppSimpleProject.SimpleProject5;

public class Main {

    public static void main(String[]args){

        Animal animal1=new Lion("Roska","Female");
        animal1.makeSound();
        animal1.animalMove();

        Animal animal2=new Bird("Serce","male");
        animal2.makeSound();
        animal2.animalMove();

    }
}
