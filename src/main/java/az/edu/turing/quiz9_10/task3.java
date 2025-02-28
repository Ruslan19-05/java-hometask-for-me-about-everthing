package az.edu.turing.quiz9_10;

public class task3 {

    public static void main(String[] args) {

        printText("Anar");
    }

    public static void printText(String text) {
        try {
            if (text == null) {
                throw new NullPointerException("Can't be null");
            } else if (text.length() < 5) {
                throw new IllegalArgumentException("Too short");
            } else {
                System.out.println(text);
            }
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}


