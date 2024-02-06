import java.util.Scanner;
public class ArrayInput {
     void arrayDemo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the"+" " +n+" "+"elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        ArrayInput obj=new ArrayInput();
        obj.arrayDemo();
    }
    
}
