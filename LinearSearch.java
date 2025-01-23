public class LinearSearch {
    public static int search(int arr[], int n, int x) {
        for (int i = 0; i < n; i = i + 1) {
            if (arr[i] == x) {
                return i;
            }
        }
            return -1;
        }
    public static void main (String args[]){
        int a[]={1,2,3,4,5,6};
        int x=5;
        int n= a.length;
        int result= search(a,n,x);
        if(result==-1){
            System.out.println("not found");
        }
        else{
            System.out.println(" found"+result);
        } 
    }
}
