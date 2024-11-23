package az.edu.turing.Homework.Tasks120;

import java.util.Scanner;

public class Easy19App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long p = 1;
        if (1 < a && a <= b && b <= 10000) {
            for (long i = a; i<=b ; i++) {
                p = p *i;
            }
            System.out.println(p);
        }

        long num=sc.nextInt();
        int d;
        int g;

    }
}

