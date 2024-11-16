package az.edu.turing.Homework;

import java.util.Scanner;

public class Methodscomparison {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first word:");
        String soz1=sc.nextLine();
        System.out.print("Enter secon word:");
        String soz2=sc.nextLine();
        System.out.print(comparison(soz1,soz2));
    }

    public static boolean comparison(String word1,String word2){
        return word1.equalsIgnoreCase(word2);
    }
}
