package az.edu.turing.quiz9_10;

import java.util.Comparator;
import java.util.Arrays;

public class ComparatorApp {

    public static void main(String[] args) {

            String[] names = {"Leyla", "Aybeniz", "Ayan"};
            Comparator<String> comparator = new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o2.length()- o1.length();
                }
            };
            Arrays.sort(names, comparator);
            System.out.println(Arrays.toString(names));
        }
    }

