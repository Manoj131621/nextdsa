package nextdsa.Arrays;

public class checkArraySortedNaive {
    static boolean getSorted(int arr[],int n){
        // int n=arr.length;
     for(int i=0;i<n;i++){
      for(int j=i;j<n;j++){
        if(arr[j]<arr[i]){
          return false;
        }
      }
     }
     return true;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        System.out.print(getSorted(arr,5));
    }
}
