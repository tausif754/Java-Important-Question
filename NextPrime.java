import java.util.Scanner;
import java.math.BigInteger;
class NextPrime {
    public static boolean isPrime(int n){
        BigInteger b=BigInteger.valueOf(n);
        return b.isProbablePrime(1);
    }
    
    public static int nextPrime(int n){
        BigInteger b=BigInteger.valueOf(n);
        String s=b.nextProbablePrime().toString();
        return Integer.parseInt(s);
    }
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number");
        int n=sc.nextInt();
        System.out.println("Is Prime "+isPrime(n));
        System.out.print("Next Prime "+nextPrime(n));
    
    }
}