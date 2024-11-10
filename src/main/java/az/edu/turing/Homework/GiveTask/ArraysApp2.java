package az.edu.turing.Homework.GiveTask;

import java.util.Scanner;

public class ArraysApp2 {

    public static void main(String[] args) {
        //input
        System.out.println("enter a word: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int b = 0;
        char[] a = {'a','e','u','o','i'};
        word=word.toLowerCase();
        //prosess
        for (int i = 0; i < word.length(); i++) {
            b = i;
        }
        System.out.println(word.charAt(b));
        for(int j=0;j< a.length;j++){
            if (word.charAt(b) == a[j] ){
                System.out.println("Sait herifdir");
                break;
            }else {
                System.out.println("sait deyil");
                break;
            }
        }
    }
}
