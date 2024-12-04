package az.edu.turing.Homework.TaskfromIlqar;

import java.util.Scanner;

public class Task7App {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);
        double num;
        double sum=0;
        int n=0;

        while(scanner.hasNext()){
            num=scanner.nextInt();
            if(num<=100){
                sum+=num;
                n++;
            }
        }
        System.out.printf("%.4f",sum/n);
    }
}
