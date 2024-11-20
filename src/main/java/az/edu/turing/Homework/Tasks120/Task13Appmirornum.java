package az.edu.turing.Homework.Tasks120;

import java.util.Scanner;

public class Task13Appmirornum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num=num3;
        int b;
        int d=0;
        int sum = 0;
        while (num>=num3 && num<=num2){
            num++;
            int temp = num;
            while (num > 0) {
                b = num % 10;
                sum = sum * 10 + b;
                num /= 10;
            }
        int n = 0;
        for (int i = 1; i <= temp; i++) {
            if (temp % i == 0) {
                n++;
            }else if(n > 2) {
                break;
            }
        }
        int a = 0;
        for (int j = 1; j <= sum; j++) {
            if (sum % j == 0) {
                a++;
            }else if (a > 2) {
                break;
            }
        }
        d++;
    }
        System.out.println(d);

    }
}
