package az.edu.turing.modul3ForPractic;

import java.util.List;
import  java.util.Arrays;

public class UpperBoundWildCard {

    public static void printNum(List<? extends Number>list){
        for(Number num:list){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        List<Integer>intlist=Arrays.asList(1,2,3);
        List<Double>doubles=Arrays.asList(1.2,2.2,3.3);

        printNum(intlist);
        printNum(doubles);
    }
}
