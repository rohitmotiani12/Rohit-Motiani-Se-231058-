import java.util.Arrays;
public class Deletion {
    public static int[] delete(int[] array,int element)
    {
        int count=0;
        for (int num : array) {
            if (num !=element) {
                count++;
            }
        }
        int[] newArray=new int[count];
        int index=0;
        for (int num:array) {
            if (num !=element) {
                newArray[index++]=num;
            }
        }

        return newArray;
    }
    public static void main(String[] args) {
        int num[]={10, 20, 30, 40, 50};
        int numberToDelete=30;
        num=delete(num, numberToDelete);
        System.out.println("Array after deletion: " + Arrays.toString(num));
    }
}