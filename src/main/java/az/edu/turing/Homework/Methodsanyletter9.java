package az.edu.turing.Homework;

import java.util.Scanner;

public class Methodsanyletter9 {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        word=word.toLowerCase();
        String herif=letter(word);
        System.out.print(herif);
    }

    public static String  letter(String word){
        String let="a";
        for(int i=0;i<word.length();i++){
           if(let.indexOf(word.charAt(i))!=-1){

           }
        }
        return let;
    }
}
