public class moveZero {
static void moveZeroValue(int arr[]){
    int n=arr.length;
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]==0 && arr[j+1]!=0){
                //swap arr[j],arr[j+1]
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}
    public static void main(String[] args) {
        int arr[]={0 ,5, 0, 3, 42};
    //call the method to move zeros
        moveZeroValue(arr);
        //print the modefied array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
}

    }
    
}
