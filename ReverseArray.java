public class ReverseArray {
    static void swapInArray(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    // print method
    static void printArray(int[]arr){
        for(int array:arr){
            System.out.print(array+" ");
        }
    }
    
    static void reverseArray(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        reverseArray(arr);
        printArray(arr);
    
    }
    
}
