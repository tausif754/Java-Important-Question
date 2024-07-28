import java.util.Scanner;
import java.math.*;
public class SortSquares {
    // print method
    static void printArray(int arr[]){
        for(int array:arr){
            System.out.println(array);
        }
    }
// swap method
    static void swapInArray(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
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
    // sort Squares method
    static int[] SortSquares(int[] arr){
        int n=arr.length;
        int left=0,rigth=n-1;
        int[]ans=new int[n];
        int k=0;
        while(left<=rigth){
            if(Math.abs(arr[left])> Math.abs(arr[rigth])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }else{
                ans[k++]=arr[rigth]*arr[rigth];
                rigth--;
            }
        }
        return ans;

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
        int ans[]=SortSquares(arr);
        System.out.print("Sorted array: ");
        reverseArray(ans);
        printArray(ans);
    }
    
}
