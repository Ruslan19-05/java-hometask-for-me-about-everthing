package az.edu.turing.Exception;

import java.util.Scanner;

public class AgeManager {

    private final int maxAges;
    private final int[] ages;
    private final   Scanner scanner;

    public AgeManager(int maxAges){
        this.maxAges=maxAges;
        this.ages=new int[maxAges];
        this.scanner=new Scanner(System.in);
    }

    public int collectAges() {
        int count = 0;
        System.out.println("Enter ages(type 'stop' or 'exit' to stop):");

        while (count < maxAges) {
            System.out.println("Enter age:");
            String input = scanner.nextLine();

            if (isExitCommand(input)) {
                break;
            }

//            try{
//                int age =parseAge
//            }
        }

        return count;
    }

    public void displayAges(int count){
        System.out.println("Entered ages:");
        for(int i=0;i<count;i++){
            System.out.println(ages[i]+" ");
        }
        System.out.println();
    }

    public void processAges(int count){
        int sum=0;
        int children=0,teenagers=0,adults=0,seniors=0;

        System.out.println("Detailed information for each age:");

        for(int i=0;i<count;i++){
            int age=ages[i];
            String factorialResult=calculateFactorialSafely(age);
            String evenOdd=isEven(age)?"Even":"Odd";

            sum+=age;

            if(age<=12){
                children++;
            }else if(age<=19){
                teenagers++;
            }else if(age<=64){
                adults++;
            }else{
                seniors++;
            }
            System.out.printf("-Age:%d -> Factorial:%s,%s.\n",age,factorialResult,evenOdd);
        }
       // displayStatistics(count,sum,children,teenagers,adults,seniors);
    }

    private boolean isExitCommand(String input){
        return input.equalsIgnoreCase("stop") || input.equalsIgnoreCase("exit");
    }

    private int parseAge(String input){
        try{
            int age=Integer.parseInt(input);
        //    validateAge(age);
            return age;
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("Invalid input! Please enter a valid number.");
        }
    }

    private String calculateFactorialSafely(int age){
        try{
            return calculateFactorial(age);
        }catch (ArithmeticException e){
            return "Factorial is too large. ";
        }
    }

    private String calculateFactorial(int age){
        if(age<0){
            throw new IllegalArgumentException("Negative numbers do not have a factorial.");
        }

        long factorial=1;
        for(int i=1;i<=age;i++){
            factorial*=i;
            if(factorial<0){
                throw new ArithmeticException("Factorial is too lage.");
            }
        }

        return String.valueOf(factorial);
    }

    private boolean isEven(int age){
        return age%2==0;
    }


}
