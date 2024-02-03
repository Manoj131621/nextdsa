package nextdsa.GFG;

public class LargestElement {
    static int getLargest(int arr[],int n){
        for(int i=0;i<n;i++){
            boolean flag=true;
            for(int j=i;j<n;j++){
                if(arr[j]>arr[i]){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,5,9,2,10};
        System.out.print(getLargest(arr,5));
    }
}
