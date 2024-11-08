package az.edu.turing.Homework;

import java.util.Scanner;

public class ArraysApp {

    public static void main(String[] args) {
        //input
        int [] ruslan={1,2,3,4,4,5,67,54,89};
        int max=ruslan[2];
        int min=ruslan[2];
        //prosess
        for(int i=0;i<ruslan.length;i++){
            if(max<ruslan[i]){
                max=ruslan[i];
            }
        }
        for(int j=0;j<ruslan.length;j++){
            if(min>ruslan[j]){
                min=ruslan[j];
            }
        }
        //output
        System.out.println(max);
        System.out.print(min);
    }
}
