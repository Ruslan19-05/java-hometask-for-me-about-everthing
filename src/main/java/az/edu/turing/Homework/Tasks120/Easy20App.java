package az.edu.turing.Homework.Tasks120;

import java.util.Scanner;

public class Easy20App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int n = 0;
        while (true) {
            if(number==polinum(number)){
                System.out.print(n);
                break;
            }else{
                number=number+polinum(number);
                n++;
            }
        }
    }
    public static int polinum(int number){
        int sum=0;
        while (number > 0) {
            sum = sum*10 + (number % 10);
            number = number / 10;
        }
        return sum;
    }
}



