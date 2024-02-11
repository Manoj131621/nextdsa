package nextdsa.Arrays;

public class moveZeroestoendefficient {
    static void moveZeroes(int arr[],int n){
       int count=0;
       for(int i=0;i<n;i++){
        if(arr[i]!=0){
            int temp=arr[i];
            arr[i]=arr[count];
            arr[count]=temp;
            count++;
        }
       }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,0,0,4,5,0,6,0,7};
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        moveZeroes(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
