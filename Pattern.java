import java.util.Scanner;
public class Pattern {

    public static void printPattern(int n){
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println(i);
        // }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==i){
                    System.out.print(i);
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }


    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int n=sc.nextInt();
        printPattern(n);
    }


    
}
