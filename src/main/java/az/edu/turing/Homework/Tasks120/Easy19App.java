package az.edu.turing.Homework.Tasks120;

import java.util.Scanner;

public class Easy19App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = a;
        long p = 1;
        if (1 < a && a <= b && b <= 10000) {
            for (int i = 0; i < a; i++) {
                p = p * (a + i);
                c = c + 1;
                if (c > b) {
                    break;
                }
            }
            System.out.print(p);
//        }
//        long a = 1;
//        long b =1;
//        long c=a;
//        long p = sc.nextInt();
//        long d=p;
//        for (int i = 0; i < p; i++) {
//            d= p / (a + 1);
//            c=c+1;
//            if (p%c==0) {
//                b=a+i;
//            }else{
//                break;
//            }
//        }
//        System.out.print(a+" "+b);
//    }
        }
    }
}

