package nextdsa.Arrays;

public class leftrotatearraybyDplaces {
    static void lRotate(int arr[],int n){
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
    static void leftRotate(int arr[],int d,int n){
        for(int i=0;i<d;i++){
            lRotate(arr, n);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        int d=3;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("After Rotation");
        // leftRotate(arr,n);
        leftRotate(arr,d,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
