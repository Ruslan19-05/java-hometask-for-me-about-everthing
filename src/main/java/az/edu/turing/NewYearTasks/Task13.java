package az.edu.turing.NewYearTasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a size for array:");
        int size=sc.nextInt();
        System.out.println("Enter a array:");
        int[] array=new int[size];
        enterArray(array);
        System.out.print("Enter check number:");
        int checkN=sc.nextInt();

        checkTheNumber(array,checkN);

    }

    public static void checkTheNumber(int[] array,int checkN){

        for(int numbers:array) {

            if(checkN==numbers){
                System.out.println(checkN+"is in array!");
                return;
            }
        }
        System.out.println(checkN+"is not in array!");
    }

    public static void enterArray(int[] arrayN) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arrayN.length; i++) {
            arrayN[i] = sc.nextInt();
        }
    }
}
