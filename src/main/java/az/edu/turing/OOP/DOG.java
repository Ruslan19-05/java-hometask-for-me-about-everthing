package az.edu.turing.OOP;

public class DOG extends Animal{

    private String gender;

    public DOG(String name,int age,String gender){
        super(name,age);
        this.gender=gender;
    }

    public String getGender(){
    return gender;
    }

    public void setGender(String gender){
        this.gender=gender;
    }

    @Override
    public String toString(){

        return getName() +" and "+getAge()+" and "+getGender();
    }
}