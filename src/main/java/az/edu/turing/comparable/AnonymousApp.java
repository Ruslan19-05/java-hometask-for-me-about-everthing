package az.edu.turing.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousApp {

    public static void main(String[] args) {

        Runnable task=new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonim sinifdən istifadə edərək bir Runnable işə düşdü! ");
            }
        };

        Thread thread=new Thread(task);
        thread.start();

        Runnable task1=()-> System.out.println("Lambda ifadəsindən istifadə edərək bir Runnable işə düşdü!");

        Thread thread1=new Thread(task1);
        thread1.start();

        List<String> names= Arrays.asList("Kamran","Aysel","Elvin");

        Collections.sort(names,new Comparator<String>(){
            @Override
            public int compare(String s1,String s2){
                return s1.compareTo(s2);
            }
        });
        System.out.println("Anonim sinif ilə sıralama: " + names);

    }
}
