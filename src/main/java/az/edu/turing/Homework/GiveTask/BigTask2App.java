package az.edu.turing.Homework.GiveTask;

import java.util.Scanner;
import java.util.Random;

public class BigTask2App {

    public static void main(String[] args) {
        //input
        System.out.println("All set.Get ready to rumble!");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[][] area = new String[5][5];
        while (true) {
            System.out.print("enter row: ");
            int a = sc.nextInt();
            System.out.print("enter colum: ");
            int b = sc.nextInt();
            int d=random.nextInt(5);
            int c=random.nextInt(5);
            if(a>=5 || b>=5){
                System.out.println("Wrong number!");
                a = sc.nextInt(5);
                b = sc.nextInt(5);
            }
            area[a][b] = "*";
            if(area[d][c]==(area[a][b])) {
                area[d][c] = "x";
                for(int i=0;i<5;i++){
                    for(int j=0;j<5;j++){
                        System.out.print(area[i][j]==null? "-":area[i][j]);
                    }
                    System.out.println();
                }
                System.out.println("You Won!");
                break;
            }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    //if(area[i][j]==null){
                    // area[i][j]="-";
                    System.out.print(area[i][j] == null ? "-" : area[i][j]);
                }
                System.out.println();
                }

        }
    }
}
