package az.edu.turing.Homework.GiveTask;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BigTask2App {

    public static void main(String[] args) {
        //shooting square
        //input
        Scanner sc = new Scanner(System.in);
        Random random=new Random();
        System.out.println("All set.Get ready to rumble!");
        String [][] grid = new String [5][5];
        // int a=sc.nextInt();
        //int b=sc.nextInt();
        //if(a<=5 && b<=5) {
        // System.out.println(Arrays.deepToString(grid));
        while (true) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid.length; j++) {

                    if(grid[i][j]==grid[a][b]){
                        System.out.println("You Won!");
                        break;
                    }
                    break;
                }
            }
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid.length; j++) {
                    System.out.print(grid[i][j]);
                    if (j < 4) {
                        System.out.print("|");
                    }
                }
                System.out.println();

                //}
            }
        }
    }
}
