package az.edu.turing.Homework.Tasks120;

import java.util.Scanner;

public class Medium9App {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int n = 0;
        if (4 <= l && l <= 200) {
            for (int i = 1; i < l; i++) {
                for (int j = 1; j < l - i; j++) {
                    for (int m = 1; m < l - i - j; m++) {
                        if ((i + j) <= m) {
                            break;
                        } else if ((i + m) <= j) {
                            break;
                        } else if ((j + m) <= i) {
                            break;
                        } else if (i == j && j == m) {
                            break;
                        } else {
                            break;
                        }
                    }
                }
            }
            System.out.print(n);
        }
    }
}
