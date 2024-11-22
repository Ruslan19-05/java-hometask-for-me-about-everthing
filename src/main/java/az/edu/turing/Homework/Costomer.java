package az.edu.turing.Homework;

public class Costomer {

    public String name;
    public String surname;
    public String gender;
    public int age;
    public String universty;

    public Costomer(String name,String surname,String gender,int age,String universty){
                this.name=name;
                this.surname=surname;
                this.gender=gender;
                this.age=age;
                this.universty=universty;
    }

    public  void costomerInfo(){
        System.out.println("Name:"+name);
        System.out.println("Surname:"+surname);
        System.out.println("Gender:"+gender);
        System.out.println("Age:"+age);
        System.out.println("Universty:"+universty);
    }
    public void changeAge(int newAge){
        System.out.print("Current age:"+(age+newAge));
    }
    public void changeUni(String newUni){
        System.out.println("Current Universty:"+newUni);
    }
    public void changeGen(String newGen){
        System.out.print("Current Gender:"+newGen);
    }
}
