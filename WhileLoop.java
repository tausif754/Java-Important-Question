import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n :");
        int n=sc.nextInt();
        int sum=0;
        int num=1;
        while(num<=n){
            System.out.println(num);
            sum+=num;
            num++;
        }
        System.out.println("Sum of" +" "+n+ " "+"natural numbers are "+sum);
    }
    
}
