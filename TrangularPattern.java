// pattern question
import java.util.Scanner;

public class TrangularPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n=sc.nextInt();
        // int i=1;
        // while (i<=n) {
        //     int j=1;
        //     while (j<=i) {
        //         System.out.print(" *");
        //         j++;
                
        //     }
        //     i++;
        //     System.out.println();
            
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }

        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" *");

            }
            System.out.println();
        }

    }
    
}
