package az.edu.turing.collections;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class List {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.remove(0);
        list1.set(0,3);

        LinkedList<Integer>list2=new LinkedList<Integer>();

        list2.add(45);
        list2.add(4);
        list2.get(0);
        list2.remove(0);
        list2.set(0,3);

        System.out.println(list1);
        System.out.println(list2);

        Set<Integer> set2=new HashSet<>();

        set2.add(5);
        System.out.println(set2);
        set2.add(6);
        System.out.println(set2);
        set2.add(9);
        System.out.println(set2);



        System.out.println(set2);

    }
}
