package az.edu.turing.Homework.Tasks120;

import java.util.Scanner;

public class Hard2Appmulti {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (n == i * j) {
                        k++;
                    }
                }
            }
            System.out.print(k / 2);
        }
    }
}
