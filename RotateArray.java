import java.util.Scanner;
public class RotateArray {
  
    // print method
    public static void printArray(int arr[]){
        for(int array:arr){
            System.out.print(array+" ");
        }
    }
    // rotate method
    public static int[] rotate(int[]arr,int k){
        int n=arr.length;
        k=k%n;
        int[]ans=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array ");
        int n=sc.nextInt();
        System.out.print("Enter "+n+" " +"elements ");
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k");
        int k=sc.nextInt();
        
        System.out.print("Original Array: ");
        printArray(arr);
        int[]ans=rotate(arr,k);
        System.out.println();
        System.out.print("After rotation: ");
        printArray(ans);
        
    }
}
