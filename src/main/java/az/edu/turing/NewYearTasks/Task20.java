package az.edu.turing.NewYearTasks;

import java.util.Scanner;

public class Task20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2= sc.nextInt();

        System.out.println("EBOB:"+findEBOB(num1,num2));
    }

    public static int findEBOB(int number1,int number2){

        while (number2!=0){
            int temp=number2;
            number2=number1%number2;
            number1=temp;
        }

        return number1;
    }
}
