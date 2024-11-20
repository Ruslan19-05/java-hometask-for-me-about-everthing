package az.edu.turing.Homework;

import java.util.Scanner;

public class Methodspractic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        polindrom(num);
    }
    public static void polindrom(String b){
        String c="";

        for (int i = b.length() - 1; i >= 0; i--) {
            c = c + b.charAt(i);
        }
        if (c.equals(b)) {
            System.out.println("polidir");
        } else {
            System.out.println("poli deyil");
        }
    }
}