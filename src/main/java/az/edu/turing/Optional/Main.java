package az.edu.turing.Optional;

import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        numbers.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}

