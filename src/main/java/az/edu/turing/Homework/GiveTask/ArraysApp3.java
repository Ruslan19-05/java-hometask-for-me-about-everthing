package az.edu.turing.Homework.GiveTask;

import java.util.Scanner;

public class ArraysApp3 {
    public static void main(String[] args) {
        /*1) Write logic to the word entered using the scanner.
          After that, the program should print the last character of the entered word.*/

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char[] vowel = {'a', 'e', 'i', 'ə', 'ö', 'u', 'ü', 'ı', 'o'};
        char endcharacter = word.charAt(word.length() - 1);
        System.out.println("End character - " + word.charAt(word.length() - 1));

        /* 2) Write the logic to insert a word and check if the last character is a vowel.
        Print a message indicating whether the last character is a vowel or not.*/

        for (int i = 0; i < vowel.length; i++) {
            if (endcharacter == vowel[i]) {
                System.out.println("Wowel charchter ");
                break;
            } else {
                System.out.println("consonant character ");
                break;
            }
        }
        //3) Type the logic to insert a word and then reverse it and capitalize it
        String word2 = scanner.nextLine();
        word2 = word2.toUpperCase();
        for (int i = word2.length() - 1; i >= 0; i--) {
            char bigword = word2.charAt(i);
            System.out.print(bigword);
            continue;
        }
    }
}