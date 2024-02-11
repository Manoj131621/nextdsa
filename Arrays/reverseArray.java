package nextdsa.Arrays;

public class reverseArray {
    static void revarr(int arr[],int n){
      int low=0,high=n-1;
      while(low<high){
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
        low++;
        high--;
      }
    }
    public static void main(String args[]){
        int arr[]={10,20,30,40,5};
        int n=5;
        revarr(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}