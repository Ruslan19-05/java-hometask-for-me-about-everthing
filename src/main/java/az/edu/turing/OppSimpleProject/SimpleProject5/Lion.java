package az.edu.turing.OppSimpleProject.SimpleProject5;

import az.edu.turing.OppSimpleProject.SimpleProject4.Move;

public class Lion extends Animal implements Move {

    public Lion(String name,String species){
        super(name,species);
    }

    @Override
    public void animalMove(){
        System.out.println("Lions are runing.");
    }

    @Override
    public void makeSound(){
        System.out.println("Roar!");
    }
}
