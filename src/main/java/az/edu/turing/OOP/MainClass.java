package az.edu.turing.OOP;

public class MainClass {

    public static void main(String[]args){

        BankAccount account1=new SavingsAccount("R1",12000,2005,12,3);
        BankAccount account2=new SavingsAccount("R2",13000,1234,13,3);
        BankAccount account3=new CurrentAccount("R3",14000,5678,-1000);
        BankAccount account4=new CurrentAccount("R4",15000,9012,-1100);
        BankAccount account5=new BankAccount("R5",16000,3456);

        //System.out.println(account1.toString());

        account1.deposit(100);
        //System.out.println(account1.toString());

        account2.withdraw(100);
        //System.out.println(account2.toString());

        account3.transfer(account4,6000);
        System.out.println(account4.toString());
    }
}
