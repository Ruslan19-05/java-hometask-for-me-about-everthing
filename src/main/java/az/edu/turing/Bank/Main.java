package az.edu.turing.Bank;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        BankAccount ruslanAccount = new BankAccount("05", new BigDecimal(2005));
        CurrencyConverter convert = new CurrencyConverter();
        CustomerValidator customer = new CustomerValidator();

        try {
            ruslanAccount.withDraw(new BigDecimal(3005));
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        try {
            convert.convert(new BigDecimal(2005), "AZN", "USD");
        } catch (UnsupportedCurrencyException e) {
            System.out.println(e.getMessage());
        }

        try {
            customer.validateCustomer("");
        } catch (InvalidCustomerException e) {
            System.out.println(e.getMessage());
        }

    }
}
