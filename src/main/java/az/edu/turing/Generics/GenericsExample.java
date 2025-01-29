package az.edu.turing.Generics;

public class GenericsExample {

    public static <T> void printArray(T[] array) {

        for (T element : array) {
            System.out.println(element);
        }
    }
}

