package az.edu.turing.NewYearTasks;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a line:");
        String aline=sc.nextLine();

        checkSymbol(aline);
    }

    public static void checkSymbol(String line){

        for(int i=0;i<line.length();i++){
            char sameSymbol=line.charAt(i);
            int count=0;

            for(int j=0;j<line.length();j++){

                if(line.charAt(j)==sameSymbol){
                    count++;
                }
            }
            if(count>1 && line.indexOf(sameSymbol)==i){
                System.out.println(sameSymbol+":"+count);
            }
        }
    }
}
