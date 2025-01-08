package az.edu.turing.NewYearTasks;

import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size for array:");
        int size=sc.nextInt();
        System.out.println("Enter number for check:");
        int checkNum=sc.nextInt();
        System.out.println("Enter number for array:");
        int[] array=new int[size];

        checkArrayNumber(checkNum,array);
    }


    public static void checkArrayNumber(int number,int[] array){

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<array.length;i++){
            array[i]= sc.nextInt();
        }

        for(int num:array){

            if(num==number){
                System.out.println(number+" is in array!");
                break;
            }
        }
    }
}
