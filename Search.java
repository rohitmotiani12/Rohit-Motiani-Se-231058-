 import java.util.Scanner;
  public class Search
  {
      public static int search(int[] array, int target)
      {
          for (int i = 0; i < array.length; i++) {
              if (array[i] == target)
              {
                  return i;
              }
          }
          return -1;
      }
      public static void main(String[] args)
      {
          int arr[] = {10, 20, 30, 40, 50};
          Scanner scanner = new Scanner(System.in);
          System.out.print("Enter a number to search: ");
          int target = scanner.nextInt();
          int index = search(arr, target);
          if (index != -1) {
              System.out.println("Number found at index: " + index);
          } else {
              System.out.println("Number not found.");
          }
      }
  }
