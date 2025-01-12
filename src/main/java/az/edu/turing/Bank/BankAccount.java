package az.edu.turing.Bank;

import java.math.BigDecimal;

public class BankAccount {

    private String accountNumber;
    private BigDecimal balance;

    public BankAccount(String accountNumber, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withDraw(BigDecimal amount){
            if(balance.compareTo(amount)<0){
                throw new InsufficientBalanceException("InsufficientBalanceException");
            }
        }
    }

