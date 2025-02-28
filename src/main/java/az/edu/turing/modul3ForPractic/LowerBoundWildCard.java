package az.edu.turing.modul3ForPractic;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class LowerBoundWildCard {

    public static void addNumbers(List<? super Integer>list){
        list.add(10);
        list.add(20);
        list.add(30);
    }

    public static void main(String[] args) {

        List<Number>numberList = new ArrayList<>();
        List<Object>objList=new ArrayList<>();

        addNumbers(numberList);
        addNumbers(objList);

        System.out.println(numberList);
        System.out.println(objList);
    }
}
