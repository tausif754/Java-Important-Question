import java.util.Scanner;

public class BubbleSort {

static void bubbleSort(int arr[]){
    int n=arr.length;
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){

            if(arr[j]>arr[j+1]){
                //swap arr[j],arr[j+1]
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //taking input from the user
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.print("Enter "+n+ " elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();   
        } 
          
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
