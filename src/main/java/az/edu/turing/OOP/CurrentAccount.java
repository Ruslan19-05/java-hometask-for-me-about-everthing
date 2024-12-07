package az.edu.turing.OOP;

public class CurrentAccount extends BankAccount {

    private double overdraftLimit;

    public CurrentAccount(String accountHolder,double balance,int accountNumber,double overdraftLimit){
        super(accountHolder,balance,accountNumber);
        this.overdraftLimit=overdraftLimit;
    }

    public double getOverdraftLimit(){
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit){
        this.overdraftLimit=overdraftLimit;
    }

    @Override
    public void displayInfo(){
        System.out.println(overdraftLimit);
    }

    @Override
    public String toString(){
        return "SavingsAccount Info:"+"\n"+getAccountHolder()+"\n"+
                getBalance()+"\n"+getAccountNumber()+"\n"+overdraftLimit;
    }
}
