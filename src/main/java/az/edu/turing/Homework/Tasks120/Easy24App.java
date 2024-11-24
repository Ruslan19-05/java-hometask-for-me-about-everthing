package az.edu.turing.Homework.Tasks120;

import java.util.Scanner;

public class Easy24App {

    public static void main(String[] arsg) {

        Scanner scanner = new Scanner(System.in);

        int firstnumber = scanner.nextInt();

        int countPrime = 0;

        int secondnumber = scanner.nextInt();
        if (1 <= firstnumber && firstnumber <= secondnumber && secondnumber <= 500000) {
            for (int j = firstnumber; j <= secondnumber; j++) {
                if (j == 13) {
                    continue;
                }
                boolean isPrime = true;

                for (int i = 2; i <= Math.sqrt(j); i++) {
                    if (j % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    countPrime++;
                }
            }
        }
        System.out.print(countPrime);

    }
}




