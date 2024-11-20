package az.edu.turing.Homework.Tasks120;

import java.util.Scanner;

public class TaskApp4Gardener {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //trees
        int N=sc.nextInt(1000000);
        //starts day
        int startday=sc.nextInt();
        //last day
        int lastday=sc.nextInt();
        float whichday=0;

        for (int i=lastday ;i>0;i--){
            whichday=1/N;
            N--;
            }
        System.out.print(whichday);

        }
    }
