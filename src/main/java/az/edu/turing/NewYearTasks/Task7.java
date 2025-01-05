package az.edu.turing.NewYearTasks;

import java.util.Scanner;
import java.util.ArrayList;

public class Task7 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();

        solveFibonacci(a);
    }

    public static void solveFibonacci(int number){

        int sum=0;
        ArrayList<Integer>array=new ArrayList<>();
        for(int i=0;i<=number;i++){

            if(((i-1)+(i-2))==i){
                array.add(i);
            }
            sum+=i;
        }

        System.out.println(array);
        System.out.println(sum);
    }
}
