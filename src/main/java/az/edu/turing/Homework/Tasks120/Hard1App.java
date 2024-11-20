package az.edu.turing.Homework.Tasks120;

import java.util.Scanner;

public class Hard1App {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] numbs = {2, 4, 5, 6, 3};

        for (int i = 0; i < numbs.length; i++) {
            for (int j = i + 1; j < numbs.length; j++) {
                if (numbs[i] + numbs[j] == target) {
                    System.out.print("[" + i + "," + j + "]");
                }


            }
        }
    }
}
