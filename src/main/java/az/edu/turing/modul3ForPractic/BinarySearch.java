package az.edu.turing.modul3ForPractic;

public class BinarySearch {

    public static void main(String[] args) {

        int []arr={1,2,3,4,5,7,34,78,99};
        int key=34;
        int low=0;
        int high=arr.length-1;

        int result=binarySearch(arr,low,high,key);

        if(result==-1){
            System.out.println("Element not found!");
        }else{
            System.out.println("Indeks of element:"+result);
        }
    }

    public static int binarySearch(int[] arr, int low, int high, int key) {

        int mid = (low + high) / 2;
        while (low <= high) {

            if (arr[mid]<key){
               low= mid++;
            }else if(arr[mid]>key){
                high=mid--;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
