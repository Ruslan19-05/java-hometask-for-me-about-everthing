package az.edu.turing.Homework.Tasks120;

import java.util.Scanner;

public class Medium19App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(((num%3==0) && (num%2==0) && (num<100) && (num>9))?"YES" : "NO");
    }
}
