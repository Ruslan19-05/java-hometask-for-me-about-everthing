package az.edu.turing;

import java.util.*;
import java.util.stream.Collectors;

public class LoopApp6 {

    public static void main(String[]args){
//
//        List<Integer> list1=List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
//
//        for(int i=0;i<list1.size();i++){
//            if(list1.get(i)%2==0){
//                System.out.println(list1.get(i)*2+" ");
//            }
//        }
//        System.out.println("________-------");
//        list1.stream().filter(element->element%2==0).map(element->element*2).forEach(System.out::println);

        LinkedList<String> list2=new LinkedList<>();

        list2.add("Ruslan");
        list2.add("faxri");
        list2.add("lale");
        list2.add("yeter");
        list2.add("senuber");
        list2.add("seyran");
        list2.add("aynur");

        LinkedList<String> linkedList1 = list2.stream()
                .filter(str -> str.startsWith("a") || str.length() > 5)
                .collect(Collectors.toCollection(LinkedList::new));


        Set<String> set=new LinkedHashSet<>();
        set.addAll(linkedList1);
        System.out.println(set);

        Queue<String> queue=new LinkedList<>();
        queue.addAll(set);
        System.out.println(queue);

        Stack<String> stack=new Stack<>();
        stack.addAll(queue);
        System.out.println(stack);
    }
}
