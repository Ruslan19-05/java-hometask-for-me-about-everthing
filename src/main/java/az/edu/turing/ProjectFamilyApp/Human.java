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
    private DayOfWeek[][] schedule;
    private Family family;

    public Human(String name, String surname, int dateOfBirth, int iQ, Pet pet,Human mother,Human father, DayOfWeek[][] schedule,Family family) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.iQ = iQ;
        this.pet = pet;
        this.schedule = schedule;
        this.family=family;
    }

    public Human(String name,String surname,int dateOfBirth){
        this.name=name;
        this.surname=surname;
        this.dateOfBirth=dateOfBirth;
    }

    public Human(String name, String surname, int year, int iq, DayOfWeek[][] schedule, Family family){
        this.name=name;
        this.surname=surname;
    }

    public Human(String name, String surname, int dateOfBirth, int iQ, Pet pet, DayOfWeek[][] schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.iQ = iQ;
        this.pet = pet;
        this.schedule = schedule;
        this.family = family;
    }

    public Human() {

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

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
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

    public DayOfWeek[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(DayOfWeek [][] schedule) {
        this.schedule = schedule;
    }

    public void greetPet(){
        System.out.println("Hello,"+family.getPet().getNickname());
    }

    public void describePet(){
        String slyness = (family.getPet().getTrickLevel() > 50) ? "Very sly" : "Almost not sly";
        System.out.println("I have an " + family.getPet().getSpecies() + "is " + family.getPet().getAge() + "years old.He is very  ");
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
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return dateOfBirth == human.dateOfBirth && iQ == human.iQ && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(pet, human.pet) && Objects.deepEquals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, dateOfBirth, iQ, pet,Arrays.deepHashCode(schedule));
    }
}
