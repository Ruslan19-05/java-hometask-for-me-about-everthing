package az.edu.turing.Homework.Tasks120;

import java.util.Scanner;

public class Hard4AppRoman {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter romnumber:");
        String romnumber = sc.nextLine();
        int sum=0;
        String[] chacter = {"I", "V", "X", "L", "C", "D", "M"};
        for (int i = 0; i < chacter.length; i++) {
            for (int j = 0; j < chacter.length; j++) {
                if (chacter[i].equals(romnumber.charAt(j))) {
                  sum=sum+1*romnumber.length();
                }
                System.out.print(sum);
            }
        }
    }
}

