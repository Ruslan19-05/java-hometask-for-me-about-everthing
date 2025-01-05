package az.edu.turing.NewYearTasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int multiplication=1;
        System.out.println("Enter numbers:");

        while(sc.hasNext()){

            int num=sc.nextInt();
            multiplication*=num;
        }

        System.out.println("Multiplication:"+multiplication);
    }
}
