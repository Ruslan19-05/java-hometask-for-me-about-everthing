package az.edu.turing.NewYearTasks;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter line:");
        String line=sc.nextLine();

        System.out.println("Line length:"+" "+line.length());
        everySymbolCount(line);

    }

    public static void everySymbolCount(String line){

        for(int i=0;i<line.length();i++){

            char symbol=line.charAt(i);
            int count=0;

            for(int j=0;j<line.length();j++){

                if(line.charAt(j)==symbol){
                    count++;
                }
            }

            if(i==line.indexOf(symbol)){
                System.out.println(symbol+":"+count);
            }
        }
    }
}
