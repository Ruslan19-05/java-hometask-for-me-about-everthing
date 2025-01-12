package az.edu.turing.Bank;

public class CustomerValidator {

    public void validateCustomer(String customerName) {


            if (customerName == null || customerName.equalsIgnoreCase("")) {
                throw new InvalidCustomerException("InvalidCustomerException");
            }
    }
}
