package az.edu.turing.quiz9_10;

public class Task2 {

    public static void main(String[] args) {

            printArray(null, 5);
        }
        public static void printArray ( int[] arr, int lastIndex){
            try {
                System.out.println("Inside try block");
                for (int i = 0; i < lastIndex; i++) {
                    System.out.println(arr[i]);
                }
            } catch (NullPointerException e) {
                System.out.println("Null pointer");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Illegal index");
            }
        }


    }
