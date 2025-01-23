import java.util.Arrays;
public class Insertion {
    public static int[] insertAtEnd(int[] array, int newElement)
    {
        int Array[]=new int[array.length + 1];
        for (int i=0;i<array.length;i++) {
            Array[i]=array[i];
        }
        Array[Array.length-1]=newElement;
        return Array;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int newNumber = 60;
        numbers=insertAtEnd(numbers, newNumber);
        System.out.println("Array after insertion: " + Arrays.toString(numbers));
    }
}