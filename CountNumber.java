import java.util.Scanner;
public class CountNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int ans=0;
        int originalNum=num;
        while(num>0){
         num= num/10;
           ans++;
        }
        System.out.println(ans);
        System.out.println(originalNum);

    }
}
