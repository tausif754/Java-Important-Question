// write a program to take input of x and y in a new line. Print the number which is nearer the integer when divided by y.
// example input-x=13,y=3
// output-12

import java.util.Scanner;

public class CustomRound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        // int nearest=(x/y);
        // System.out.println(nearest*y);
        int rem=x%y;
        int temp=(y-rem);
        if(rem<temp){
            // return x-rem; 
            System.out.println(x-rem);
        }else{
            // return x+rem;
            System.out.println(x+tem);
        }
    }
    
}
