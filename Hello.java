import java.util.Scanner;
public class Hello{
    public static void main(String args[]){
        // System.out.println("hello World");
        //what is the output of the following code, if input is hello world 21

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String p=sc.next();
        int q=sc.nextInt();//output is Input Mismatch Exception
        System.out.print(p+" "+q);
    }
}