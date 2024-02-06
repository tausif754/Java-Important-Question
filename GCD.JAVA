import java.util.Scanner;
public class GCD{

//Through iteration method
    static int iGCD(int x,int y){
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
       
    }
    //Through Recursion method
    static int GCD(int x,int y){
        // base case
        if(y==0) return x;
        return GCD(y,x%y);
        
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("GCD="+iGCD(x,y));
        System.out.print("GCD="+GCD(x,y));
        // System.out.println(int LCM=(x*y)/GCD);
    }

}
