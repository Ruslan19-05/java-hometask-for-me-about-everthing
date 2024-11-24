package az.edu.turing.Homework.Tasks120;

import java.util.Scanner;


public class Medium3App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poli = scanner.nextInt();
        int sum = 0;
        int temp=poli;
        int n = 0;
        while (poli > 0) {
            n = poli % 10;
            sum = sum * 10 + n;
            poli /= 10;

        }
        if (sum == temp) {
            System.out.print("ture");
        }
    }
}

