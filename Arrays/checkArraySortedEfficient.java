package nextdsa.Arrays;

public class checkArraySortedEfficient {
    static boolean sortedEfficient(int arr[],int n){
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int arr[]={4,3,56,453,5,9};
        System.out.print(sortedEfficient(arr,6));
    }
}
