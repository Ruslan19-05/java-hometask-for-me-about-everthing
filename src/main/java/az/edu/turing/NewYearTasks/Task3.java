package az.edu.turing.NewYearTasks;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        int [] array=makeArray();
        checkNum(array);
    }

    public static int[] makeArray(){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array size:");
        int size=sc.nextInt();
        int[] array=new int [size];

        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }

        return array;
    }

    public static void checkNum(int[] array){

        int sumEvenNum=0;
        int sumOddNum=0;

        for(int num:array){
            if(num%2==0){
                sumEvenNum+=num;

            }else if(num%2==1){
                sumOddNum+=num;
            }
        }

        System.out.println("Sum for Even Numbers:"+sumEvenNum);
        System.out.println("Sum for Odd Numbers:"+sumOddNum);
    }
}
