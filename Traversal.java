public class Traversal {
    public static void traverse(int arr[]){
        for(int i=0; i< arr.length;i=i+1){
            System.out.println(arr[i]);
        }
    }
    public static void main (String args[]){
        int arr[]={10,20,30,40};
        traverse(arr);
    }
}
