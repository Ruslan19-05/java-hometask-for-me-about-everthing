package az.edu.turing.Exception;

import java.util.Scanner;

public class Exception {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] ages = new int[50];
        int count=0;
        int factorial=1;
        int sum=0;
        System.out.println("Enter array numbers:");

        while(true) {

            System.out.println("Enter age:");
            String input=sc.nextLine();

            if(input.equalsIgnoreCase("stop") || input.equalsIgnoreCase("exit")){
                break;
            }

            try {

                int age=Integer.parseInt(input);

                if(age<0){
                    throw new IllegalArgumentException("Age is can't minus");
                }

                if(age>200){
                    throw new ArithmeticException("Age is bigger!");
                }

                if(count<50){
                    ages[count]=age;
                    count++;
                }else{
                    System.out.println("Limit is dropped!");
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Burada NumberFormatException var!");
            }catch (IllegalArgumentException e){
                System.out.println("Exception:"+e.getMessage());
            }catch (ArithmeticException e){
                System.out.println("Exception:"+e.getMessage());
            }
        }

        System.out.println("Entered number for ages:");
        for(int i=0;i<count;i++){
            System.out.print("["+ages[i]+"],");
        }
    }
}
