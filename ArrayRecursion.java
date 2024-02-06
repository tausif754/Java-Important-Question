public class ArrayRecursion {


// traverse the array
static void printArray(int arr[],int idx){
    //base case
    if(idx==arr.length){
        return;
    }
    //self work
    System.out.print(arr[idx]);
    //recursive work
    printArray(arr,idx+1);
}
//find the max in the array
static int maxInArray(arr[],int idx){
    //base case
    if(idx==arr.length-1){
        return arr[idx];
    }
    int smallAns=maxInArray(arr,idx+1);
    return Math.max(smallAns,arr[idx]);
}


    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        // printArray(arr,idx=0);
        System.out.println(maxInArray(arr,idx 0))

    }
    
}
