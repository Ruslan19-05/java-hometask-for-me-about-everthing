package az.edu.turing.ProjectFamilyApp;

public class Dog extends Pet implements Foul{

    public Dog(String nickname,int age,int trickLevel,String[] habits){
        super(nickname,age,trickLevel,habits);
    }

    @Override
    public void respond(){
        System.out.println("Woof! Woof! I am your loyal dog.");
    }

    @Override
    public void foul(){
            System.out.println("Opps,I made a mess.");
    }
}
