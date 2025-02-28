package az.edu.turing.quiz9_10;

public class Calculator {

    public static <T> T sum(T num1, T num2) {
        if (num1 instanceof Number && num2 instanceof Number) {
            Double sum = ((Number) num1).doubleValue() +
                    ((Number) num2).doubleValue();
            return (T) sum;
        } else {
            System.out.println("Enter a numeric value");
            return null;
        }
    }
}
