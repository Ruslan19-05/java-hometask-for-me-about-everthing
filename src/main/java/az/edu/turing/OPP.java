package az.edu.turing;

public class OPP {
    //ALT+SHIFT+S
    public int number;
    public String name;
    public String surname;
    public int practic;
    public double salary;


    public OPP(int no,String name,String surname,int practic,double salary){
        this.number=no;
        this.name=name;
        this.surname=surname;
        this.practic=practic;
        this.salary=salary;
    }

    public void clisianBilgiler(){
        System.out.println("************ Work Information **************");
        System.out.println("Number:"+number);
        System.out.println("Name:"+name);
        System.out.println("Surname:"+surname);
        System.out.println("Work Expirance:"+practic);
        System.out.println("Salary:"+salary);
    }
    public void  increaceSalary(int newSalary){
        System.out.println("We are your salary is increased!"+newSalary+"$ increased your salary");
        System.out.println("Your current Salary:"+(salary+newSalary));
    }
    public void formatdo(String operatingSystem,String who){
        System.out.println(who+"to operating System"+operatingSystem+"doing format current!");

    }

}
