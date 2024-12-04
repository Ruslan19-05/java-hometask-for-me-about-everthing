package az.edu.turing.OOP;

public class Developer extends Employee {

    private String proqrammingLanguage;

    public Developer(String name, double salary, String proqrammingLanguage) {

        super(name, salary);
        this.proqrammingLanguage = proqrammingLanguage;
    }

    public String getProqrammingLanguage() {
        return proqrammingLanguage;
    }

    public void setProqrammingLanguage(String proqrammingLanguage) {
        this.proqrammingLanguage = proqrammingLanguage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(proqrammingLanguage);

    }

    @Override
    public void calculateBonus(double percentage, double fixedAmount){

        double bonus=(getSalary()*(percentage/100))+fixedAmount;
        System.out.print("Bonus:"+bonus);
    }

    public String toString(){
        return getName()+","+getSalary()+","+proqrammingLanguage;
    }
}
