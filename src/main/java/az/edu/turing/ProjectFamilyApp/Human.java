package az.edu.turing.ProjectFamilyApp;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Human {

    private String name;
    private String surname;
    private int dateOfBirth;
    private int iQ;
    private Pet pet;
    private Human mother;
    private Human father;
    private int [][] schedule;

    public Human(String name, String surname, int dateOfBirth, int iQ, Pet pet, Human mother, Human father, int[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.iQ = iQ;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human(String name,String surname,int dateOfBirth){
        this.name=name;
        this.surname=surname;
        this.dateOfBirth=dateOfBirth;
    }

    public Human(String name,String surname,Human father,Human mother){
        this.name=name;
        this.surname=surname;
        this.father=father;
        this.mother=mother;
    }

    public Human(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getiQ() {
        return iQ;
    }

    public void setiQ(int iQ) {
        this.iQ = iQ;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public int[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(int[][] schedule) {
        this.schedule = schedule;
    }

    public void greetPet(){
        System.out.println("Hello,"+pet.getNickname());
    }

    public void describePet(){
        String s;
        if(pet.getTrickLevel()>50){
             s=" very sly";
        }else {
             s=" almost not sly";
        }
        System.out.println("I have an "+pet.getSpecies()+" is "+pet.getAge()+
                " years old, he is"+s);
    }

    public boolean feedPet(boolean isFeedingTimes){
        if (pet == null) {
            System.out.println("No pet assigned to " + name);
            return false;
        }
        if(isFeedingTimes) {
            System.out.println("Hmm... I will feed "+pet.getNickname()+"'s"+pet.getSpecies());
            return true;
        }else{
            Random random=new Random();
            int randomNum= random.nextInt(101);
            if(pet.getTrickLevel()>randomNum){
                System.out.println("Hm...I will feed "+pet.getNickname()+"'s"+pet.getSpecies());
                return true;
            }else{
                System.out.println("I think "+pet.getNickname()+"'s"+pet.getSpecies()+" is not hungry");
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", iQ=" + iQ +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return dateOfBirth == human.dateOfBirth && iQ == human.iQ && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(pet, human.pet) && Objects.equals(mother, human.mother) && Objects.equals(father, human.father) && Objects.deepEquals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, dateOfBirth, iQ, pet, mother, father, Arrays.deepHashCode(schedule));
    }
}
