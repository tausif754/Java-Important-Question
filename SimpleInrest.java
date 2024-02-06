import java.util.Scanner;
public class SimpleInrest {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principle:");
        float p=sc.nextFloat();
        System.out.println("Enter the rate:");
        float r=sc.nextFloat();
        System.out.println("Enter the Time:");
        float t=sc.nextFloat();
        float si=(p*r*t)/100;
        System.out.println("Principle:"+p);
        System.out.println("Rate:"+r);
        System.out.println("Time:"+t);
        System.out.println("Simple Intrest="+si);


    }
    
}
