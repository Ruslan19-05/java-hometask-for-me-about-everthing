package az.edu.turing.Homework.TaskfromIlqar;

import java.util.Scanner;

public class Task6 {

    public static void main(String []args){

        Scanner scanner=new Scanner(System.in);
        int number;
        int count=0;
        int sum=0;

        while(scanner.hasNext()){
            number= scanner.nextInt();
            count++;
            sum+=number;
        }
        System.out.print(count+" "+sum);
    }
}
