package az.edu.turing.ProjectFamilyApp;

import java.util.Objects;

public abstract class Pet {

    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet(Species species,String nickname,int age,int trickLevel,String[] habits){
        this.nickname=nickname;
        this.age=age;
        this.trickLevel=trickLevel;
        this.habits=habits;
    }

    public Pet(Species species,String nickname){
        this.species=species;
        this.nickname=nickname;
    }

    public Pet(){

    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public void eat(){
        System.out.println("I am eating.");
    }

    public void respond(){
        System.out.println("Hello, owner. I am " +nickname+ " name of the pet. I miss you!");
    }

    public void foul(){
        System.out.println("I need to cover it up!");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits='" + habits + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || getClass()!=o.getClass()) return false;
        Pet pet=(Pet)o;
        return Objects.equals(species,pet.species) && Objects.equals(nickname,pet.nickname) && age==pet.age &&
                trickLevel==pet.trickLevel && Objects.equals(habits,pet.habits);
    }

    @Override
    public int hashCode(){
        return Objects.hash(species,nickname,age,trickLevel,habits);
    }
}
