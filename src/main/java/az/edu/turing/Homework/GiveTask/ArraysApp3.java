package az.edu.turing.Homework.GiveTask;

import java.util.Locale;
import java.util.Scanner;

public class ArraysApp3 {

    public static void main(String[] args) {
       //input
        System.out.println("enter a word: ");
        Scanner scanner = new Scanner(System.in);
        String word=scanner.nextLine();
        String reverse="";
        //prosess
        for(int i=0;i<word.length();i++){
            System.out.println(word.charAt(i)+ " ");
        }
        for(int j=word.length()-1;j>=0;j--){
            reverse=reverse + word.charAt(j);
         }
        System.out.println(reverse.toUpperCase());
    }
}