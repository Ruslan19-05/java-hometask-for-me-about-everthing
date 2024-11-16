package az.edu.turing.Homework;

import java.util.Scanner;

public class Methodsanyletter9 {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word:");
        String word=sc.nextLine();
        word=word.toLowerCase();
        letter(word);
    }

    public static void  letter(String word){
        String let="a";
        for(int i=0;i<word.length();i++){
           if(let.indexOf(word.charAt(i))!=-1){
                System.out.print("The letter:"+let);
           }
        }
    }
}
