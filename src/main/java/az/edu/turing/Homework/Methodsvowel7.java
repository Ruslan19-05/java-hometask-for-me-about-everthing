package az.edu.turing.Homework;

import java.util.Locale;
import java.util.Scanner;

public class Methodsvowel7 {

    public static void main(String[]aegs){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String vord=sc.nextLine();
        vord=vord.toLowerCase(Locale.ROOT);
        int vowels=countvowel(vord);
        System.out.print("Count vowels: "+vowels);
    }

    public static int countvowel(String word){
        String arr="aeəuüoöıi";
        int n=0;
        for(int i=0;i<word.length();i++) {
            if (arr.indexOf(word.charAt(i))!=-1){
                    n++;
            }
        }
        return n;
    }
}
