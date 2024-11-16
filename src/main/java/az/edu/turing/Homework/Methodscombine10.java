package az.edu.turing.Homework;

import java.util.Scanner;

public class Methodscombine10 {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first word:");
        String firstword=sc.nextLine();
        System.out.print("Enter second word: ");
        String secondword=sc.nextLine();
        String result=combine(firstword,secondword);
        System.out.print(result);
    }
    public static String combine(String word1,String word2){
        String common="";
        common=word1.concat(word2);
        return common;
    }
}
