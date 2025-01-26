import java.util.*;
public class ArrayDelt {
    public static int[] deleteAtIndex(int[] arr, int index) {
        int newArr[]=new int[arr.length - 1];
        for (int i=0;i<index;i++) {
            newArr[i]=arr[i];
        }
        for (int i=index+1;i<arr.length;i++) {
            newArr[i - 1] = arr[i];
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int index = 2;
        arr = deleteAtIndex(arr, index);
        System.out.println("Array after deletion: "+Arrays.toString(arr));
    }
}