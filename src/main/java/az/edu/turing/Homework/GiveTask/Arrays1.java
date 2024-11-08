package az.edu.turing.Homework.GiveTask;

import java.util.Scanner;

public class Arrays1 {

    public static void main(String[] args) {
        //input
        System.out.println("enter a word: ");
        Scanner scanner = new Scanner(System.in);
        String word=scanner.nextLine();
        int b=0;
        //prosess
        for(int i=0;i<word.length();i++){
            b=i;
        }
        //output
        System.out.println(word.charAt(b));
    }
}
