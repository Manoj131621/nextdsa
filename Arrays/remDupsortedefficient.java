package nextdsa.Arrays;

public class remDupsortedefficient {
    static int remDupeff(int arr[],int n){
        int res=1;
        for(int i=1;i<n;i++){
            if(arr[res]!=arr[i]){
            arr[res]=arr[i];
            res++;
            }
        }
        return res;
    }

public static void main(String args[]){
   int arr[]={1,2,3,3,4,4,4,5,5};
   int n=arr.length;
   for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
   } 
   System.out.println();
   n=remDupeff(arr, n);
   for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
   }
}
}


