package az.edu.turing.NewYearTasks;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();

        reverseNum(num);

    }

    public static void reverseNum(int number){

        int a;
        int sum=0;
        int num2=0;

        while(number>0){
            a=number%10;
            number/=10;
            num2=num2*10+a;
            sum+=a;
        }

        System.out.println("Sum of the numbers:"+sum);
        System.out.println("Reverse number:"+num2);
    }
}
