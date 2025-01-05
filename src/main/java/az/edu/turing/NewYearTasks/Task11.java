package az.edu.turing.NewYearTasks;

import java.util.Scanner;

public class Task11 {

    public static void main(String []args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the line:");
        String line=sc.nextLine();
        palindromLine(line);


    }

    public static void palindromLine(String line){

        StringBuilder secondLine=new StringBuilder();

        for(int i=line.length()-1;i>=0;i--){

            secondLine.append(line.charAt(i));
        }

        if(line.contentEquals(secondLine)){
            System.out.println("Line is palindrom!");
        }else{
            System.out.println("Line is not palindrom!");
        }
    }
}
