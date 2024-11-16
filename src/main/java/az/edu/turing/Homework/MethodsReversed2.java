package az.edu.turing.Homework;

//import java.util.Scanner;


import java.util.Locale;

public class MethodsReversed2 {

    public static String reverseString(String str){
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }
        return reversed;
    }
    public static void main(String []args){
        String original="Ruslan";
        String ters=reverseString(original);
                System.out.println(ters.toUpperCase(Locale.ROOT));
    }
}
