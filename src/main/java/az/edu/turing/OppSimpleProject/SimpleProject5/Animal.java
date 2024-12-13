package az.edu.turing.OppSimpleProject.SimpleProject5;

import az.edu.turing.OppSimpleProject.SimpleProject4.Move;

import java.util.Objects;

public class Animal implements Move {

    private String name;
    private String species;

    public Animal(String name,String species){
        this.name=name;
        this.species=species;
    }

    public String getName(){
        return name;
    }

    public String getSpecies(){
        return species;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSpecies(String species){
        this.species=species;
    }

    @Override
    public void animalMove(){
        System.out.println("Animals are moveing");
    }

    public void displayInfo(){
        System.out.println("Name:"+name+"\n"+"Specie:"+species);
    }

    public void makeSound(){
        System.out.println("Animals make sound.");
    }

    @Override
    public String toString(){
        return "Name:"+name+"\n"+"Specie:"+species;
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || getClass()!=o.getClass()) return false;
        Animal animal=(Animal) o;
        return Objects.equals(name,animal.name) && Objects.equals(species,animal.species);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,species);
    }


}
