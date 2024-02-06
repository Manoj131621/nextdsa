package nextdsa.Arrays;

public class secondLargestEfficient {
  static int secondLargest(int arr[],int n){
    int res=-1,largest=0;
    for(int i=0;i<n;i++){
        if(arr[i]>arr[largest]){
            res=largest;
            largest=i;
        }
        else if(res==-1 || arr[res]>arr[largest]){
            res=i;
        }
    }
    return res;
  }
 
    public static void main(String args[]){
        int arr[]={7,3,6,8,3,9,2,1};
        System.out.println(secondLargest(arr,8));
    }
}
