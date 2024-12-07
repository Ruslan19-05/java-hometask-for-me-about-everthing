package az.edu.turing.OOP;

import com.sun.source.tree.BreakTree;

public class BankAccount {

    private String accountHolder;
    private double balance;
    private int accountNumber;

    public BankAccount(String accountHolder,double balance,int accountNumber){
        this.accountHolder=accountHolder;
        this.balance=balance;
        this.accountNumber=accountNumber;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public double getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }

    public double deposit(double amount){
        balance+=amount;
        return balance;
    }

    public double withdraw(double amount){
        balance-=amount;
        if(balance<0){
            System.out.println("Your balance is below zero.");
        }
        return balance;
    }
    public void displayInfo(){
        System.out.print(accountHolder+"\n"+balance+"\n"+accountNumber);
    }

    public void transfer(BankAccount recipient,double amount){
        balance-=amount;
        recipient.balance+=amount;
    }

    @Override
    public String toString(){
        return "BankAccount Info:"+"\n"+accountHolder+"\n"+balance+"\n"+accountNumber;
    }
}
