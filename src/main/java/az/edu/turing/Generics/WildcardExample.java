package az.edu.turing.Generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample {

    public static void printList(List<?> list){
        for(Object element:list){
            System.out.println(element);
        }
    }
}
