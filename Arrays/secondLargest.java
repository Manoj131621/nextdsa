package nextdsa.Arrays;

public class secondLargest {
   static int getLargest(int arr[],int n){
    int largest=0;
    for(int i=1;i<n;i++){
        if(arr[i]>largest){
            largest=i;
        }
    }
    return largest;
   }
   static int secLargest(int arr[],int n){
    int res=-1;
    int largest=getLargest(arr, n);
    for(int i=0;i<n;i++){
        if(arr[i]!=arr[largest]){
            if(res==-1)
            res=i;
            else if(arr[i]>arr[res])
            res=i;
        }
    }
    return res;
   }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(getLargest(arr,5));
        System.out.println(secLargest(arr,5));
        // System.out.print()
    }

}
// TL- O(Nsquare)