package az.edu.turing.OOP;

public class Manager extends Employee{

    private int teamSize;

    public Manager(String name,double salary,int teamSize){
        super(name,salary);
        this.teamSize=teamSize;
    }

    public int getTeamSize(){
        return teamSize;
    }

    public void setTeamSize(int teamSize){
        this.teamSize=teamSize;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(teamSize);
    }

    @Override
    public void calculateBonus(double percentage, double fixedAmount){

        double bonus=(getSalary()*(percentage/100))+fixedAmount;
        System.out.print("Bonus:"+bonus);
    }

    public String toString(){
        return getName()+"--"+getSalary()+"--"+teamSize;
    }
}
