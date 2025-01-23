import java.util.*;

public class Find {
    public int search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String args[]) {
        int arr[] = {1, 6, 7, 8, 4, 99};
        int key = 4;
        Find finder = new Find(); // Create an instance of the Find class
        int index = finder.search(arr, key); // Call the search method

        if (index >= 0) {
            System.out.println("Key found at element " + index);
        } else {
            System.out.println("Key not found");
        }
    }
}