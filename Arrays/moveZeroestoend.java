package nextdsa.Arrays;

public class moveZeroestoend {
    static void movZeroes(int arr[],int n){
       for(int i=0;i<n;i++){
        if(arr[i]==0){
            for(int j=i+1;j<n;j++){
                if(arr[j]!=0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
       }
       }

    public static void main(String args[]){
        int arr[]={1,2,3,0,0,4,0,5,6};
        int n=arr.length;
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();
        movZeroes(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
