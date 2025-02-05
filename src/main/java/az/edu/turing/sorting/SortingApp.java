package az.edu.turing.sorting;

public class SortingApp {

    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 4, 65, 6, 7, 64};

        int numberFind=3;
        int result=binarySearch(ints,numberFind);
        System.out.println(result);
    }

    public static int binarySearch(int[] arr, int numberFind) {

        int right = 0;
        int left = arr.length - 1;

        while (right <= left) {
            int mid = (right + left) / 2;
            int midNum = arr[mid];

            if (numberFind == midNum) {
                return mid;
            }
            if (numberFind < midNum) {
                return binarySearch(arr,mid - 1);
            } else {
               return binarySearch(arr,mid + 1);
            }
        }
        return -1;
    }
}

