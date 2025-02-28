package az.edu.turing.quiz9_10;

public class BoxApp2 {

        public static void main(String[] args) {
            Box<String> result1 = divide("10", "2");
            System.out.println(result1.getData());
            Box<String> result2 = divide("5", "0");
            System.out.println(result2.getData());
        }

        public static Box<String> divide(String a, String b) {
            try {
                int num1 = Integer.parseInt(a);
                int num2 = Integer.parseInt(b);
                int result = num1 / num2;
                return new Box<>(String.valueOf(result));
            } catch (ArithmeticException e) {
                return new Box<>("Can't / by 0");
            }
        }
    }
