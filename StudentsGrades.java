import java.util.Scanner;
public class StudentsGrades {
     public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
         int[] arr= new int [4];
        int n=arr. length ;
        for (int j=0;j<n;j=j+1) {
            System.out.print("Enter grade of student "+(j+1)+" ");
            arr[j] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Grade ofstudent"+(i + 1)+"= ");
            print ( arr[i] ) ;
        }
        double average=Average(arr);
        System.out.println("Average grade"+ average);
        System.out.print("Enter a grade to find its neighbors") ;
        int key=sc.nextInt() ;
        search(arr,key);
    }
    public static void print(int grade) {
        if  (grade<50) {
             System.out.println("Fail");
        }
          else if(grade >= 50  &&  grade < 60)
        {

            System.out.println("C Grade");
        }
           else if(grade>=60&&grade < 70)
           {
             System.out.println("B Grade");
        }
           else if(grade >= 70 && grade < 80) {
            System.out.println("A Grade");
        } else if (grade >= 80) {
            System.out.println("A-1 Grade"); }
       else {
            System.out.println("not valid ");
        }}
    public static double Average(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
    public static void search(int[] grades, int key) {
        boolean found = false;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == key) {
                System.out.print("Neighbor " + key  + " ");
                if (i > 0) {
                    System.out.print("Left neighbor: " + grades[i - 1] + " ");
                } else {
                    System.out.print("No left neighbor ");
                }
                if (i < grades.length - 1) {
                     System.out.print("Right neighbor: " + grades[i + 1]);
                }
                 else
                 {System.out.print("No any  right neighbor");
                 }}
        }
        if (! found ) {
            System.out.println("not any neighbour   exist for  " +  key);
         }
    }
}