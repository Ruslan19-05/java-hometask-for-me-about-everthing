package az.edu.turing.Homework.GiveTask;

import java.util.Scanner;

public class ArraysApp2 {

    public static void main(String[] args) {
        //input
        System.out.println("enter your word: ");
        Scanner scanner = new Scanner(System.in);
        String word= scanner.nextLine();
        int a=0;
        String letter="a,e,i,u,o";
        for(int i=0;i<word.length();i++){
            a=i;
                if(letter.charAt(a)==word.charAt(a))
                    System.out.println("Sait herif var");
        }
        System.out.println("Sait herif yoxdurr");
    }
}
