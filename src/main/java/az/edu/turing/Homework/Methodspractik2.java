package az.edu.turing.Homework;

import java.util.Scanner;

public class Methodspractik2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        fibbo(num);
    }

    public static int fibbo(int a) {
        int first = 0;
        int second = 1;
        int count = 0;
        for (int i = 2; i < a; i++) {
            count = first + second;
        }
        return a;
    }
}
