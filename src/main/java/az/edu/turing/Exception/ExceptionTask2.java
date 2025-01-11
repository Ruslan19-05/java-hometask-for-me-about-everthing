package az.edu.turing.Exception;

import java.util.Scanner;

public class ExceptionTask2 {

    public static void main(String[] args) {
        Scanner scx=new Scanner(System.in);

        while(scx.hasNext()){
            int count=0;
            int age=scx.nextInt();
            int factorial=1;
            factorial*=age;
            count++;
            int cem=0;
            cem+=age;


            if(age%2==0){
                System.out.println("age is even");
            }else{
                System.out.println("age is odd");
            }


        }
    }
}
