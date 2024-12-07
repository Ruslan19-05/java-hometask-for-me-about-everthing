package az.edu.turing.OOP;

import java.sql.SQLOutput;

public class SavingsAccount extends BankAccount {

    private double monthlyInterestRate;
    private int withdrawlLimit;

    public SavingsAccount(String accountHolder,double balance,int accountNumber,double monthlyInterestRate,int withdrawlLimit){
        super(accountHolder,balance,accountNumber);
        this.monthlyInterestRate=monthlyInterestRate;
        this.withdrawlLimit=withdrawlLimit;
    }

    public double getMonthlyInterestRate(){
        return monthlyInterestRate;
    }

    public int getWithdrawlLimit(){
        return withdrawlLimit;
    }

    public void setMonthlyInterestRate(double monthlyInterestRate){
        this.monthlyInterestRate=monthlyInterestRate;
    }

    public void setWithdrawlLimit(int withdrawlLimit){
        this.withdrawlLimit=withdrawlLimit;
    }
    @Override
    public double withdraw(double amount){
        if(amount>getBalance()){
            System.out.println("You are pass limit!");
        }
        withdrawlLimit--;
        amount-=500;
        return withdrawlLimit;
    }

    public void applyInterest(){

    }


    @Override
    public void displayInfo(){
        System.out.print(monthlyInterestRate+"\n"+withdrawlLimit);
    }

    @Override
    public String toString(){
        return "SavingsAccount Info:"+"\n"+getAccountHolder()+"\n"+
                getBalance()+"\n"+getAccountNumber()+"\n"+monthlyInterestRate+"\n"+withdrawlLimit;
    }
}
