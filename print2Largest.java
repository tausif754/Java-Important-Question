public class print2Largest {
//largest element in the array
static int findMax(int arr[],int n){
    int mx=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        if(arr[i]>mx){
            mx=arr[i];
        }
    }
    return mx;
}
//find the second largest
static int findSecondMax(int arr[],int n){
    int mx=findMax(arr,n);
    for(int i=0;i<n;i++){
        if(arr[i]==mx){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    int secondMax=findMax(arr,n);
    return secondMax;
}

    public static void main(String[] args) {
        int arr[]={12,35,100,10,34,1};
        int n=arr.length;
        System.out.println("Largest element is:"+findMax(arr,n));
        System.out.println("Second Largest element is: "+findSecondMax(arr, n));
    }
    
}
