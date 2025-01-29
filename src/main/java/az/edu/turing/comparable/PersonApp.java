package az.edu.turing.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonApp {

    public static void main(String []args){

        List<Person> people =new ArrayList<>();

        people.add(new Person("Ruslan",19));
        people.add(new Person("Mikalancelo",466));
        people.add(new Person("Dicaprio",57));

        Collections.sort(people);

        System.out.println("Yasa gore siralama:"+people);

        Comparator<Person> byName=(p1,p2)-> p1.name.compareTo(p2.name);
        Collections.sort(people,byName);
        System.out.println("Ada gore siralama:"+people);
    }
}
