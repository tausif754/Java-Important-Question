import java.util.Scanner;
public class SortArray {
    // print method
    static void printArray(int arr[]){
        for(int array:arr){
            System.out.println(array);
        }
    }
// swap method
    static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    // sorting method
    static void sortZerosandOnes(int[]arr){
        int n=arr.length;
        int left=0;
        int rigth=n-1;
        while (left<rigth) {
            if(arr[left]==1 && arr[rigth]==0){
                swap(arr,left,rigth);
                left++;
                rigth--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[rigth]==1){
                rigth--;
            }
            
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter"+" "+n +" "+"elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Original Array: ");
        printArray(arr);
        sortZerosandOnes(arr);
        System.out.print("Sorted array: ");
        printArray(arr);
    }
    
}
