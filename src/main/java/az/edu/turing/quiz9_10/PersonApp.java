package az.edu.turing.quiz9_10;

import java.util.Arrays;

public class PersonApp {

    public static void main(String[] args) {

        Person1 person1 = new Person1("Elvin", 25, 70);
        Person1 person2 = new Person1("Osman", 24, 60);
        Person1 person3 = new Person1("Elnur", 27, 80);

       Person1[] people = {person1, person2, person3};
//        Arrays.sort(people, (p1, p2)->
//                p2.getName().compareTo(p1.getName()));
//        System.out.println(Arrays.toString(people));

        FilterPeople filterPeople = p -> {
            if (p.getAge() > 25)
                System.out.println(p);
        };
        for (Person1 p : people) {
            filterPeople.filter(p);
        }

//        Predicate<Person1> tester = p->
//                p.getWeight() > 60 || p.getAge() > 25;
//        for (Person1 p: people) {
//            System.out.println(tester.test(p));
//        }

//        Consumer<Person1> feeder = p ->
//                p.setWeight(p.getWeight() + 10);
//        Function<Person1, String> modifier = p -> {
//            if (p.getWeight() > 80)
//                return p.getName().toUpperCase();
//            else
//                return p.getName();
//        };
//        for (Person1 person : people) {
//            feeder.accept(person);
//            person.setName(modifier.apply(person));
//            System.out.println(person);
//        }
    }
}
