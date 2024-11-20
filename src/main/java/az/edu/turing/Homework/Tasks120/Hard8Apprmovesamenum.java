package az.edu.turing.Homework.Tasks120;

import java.util.Arrays;
import java.util.Scanner;

public class Hard8Apprmovesamenum {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int[] nums=new int[7];
            int k=0;
            int [] arr=new int[7];
            for(int i=0;i<nums.length;i++){
                nums[i]=sc.nextInt();
            }
            for(int a=0;a<nums.length-1;a++){
                    if(nums[a]==nums[a+1]){
                        k++;
                        arr[a]=nums[a];
                    }else{
                        arr[a]=nums[a]+nums[a+1];
                }
            }

            System.out.print(Arrays.toString(arr));
            System.out.print(nums.length-k);

    }
}
