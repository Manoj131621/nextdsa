package nextdsa.GFG;

public class LargestElement {
    static int getLargest(int arr[],int n){
       int res=0;
       for(int i=0;i<n;i++){
        if(arr[i]>arr[res]){
            res=i;
        }
       }
       return res;
    }
    public static void main(String[] args) {
        int arr[]={3,5,19,2,10};
        System.out.print(getLargest(arr,5));
    }
}
