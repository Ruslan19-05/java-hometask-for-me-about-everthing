package az.edu.turing.Bank;

public class InsufficientBalanceException extends RuntimeException {

    public InsufficientBalanceException(String massage) {
        super(massage);
    }
}
