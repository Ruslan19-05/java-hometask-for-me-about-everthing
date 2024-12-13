package az.edu.turing.OppSimpleProject.SimpleProject5;

import az.edu.turing.OppSimpleProject.SimpleProject4.Move;

public class Bird extends Animal implements Move {

    public Bird(String name,String species){
        super(name,species);
    }

    @Override
    public void animalMove(){
        System.out.println("Birds are flaying.");
    }

    @Override
    public void makeSound(){

        System.out.println("Chirp!");
    }
}
