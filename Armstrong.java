public class Armstrong {
    static boolean isArmstrong(int n){
        //Calculate the number of digits
        int numberOfDigits=String.valueOf(n).length();
        int originalNumber=n;
        int sum=0;
        while(n>0){
            int digits=n%10;
            sum+=Math.pow(digits, numberOfDigits);
            n=n/10;
        }
        return sum==originalNumber;

    }
    public static void main(String[] args) {
        int numToCheck=153;
        if(isArmstrong(numToCheck)){
            System.out.println(numToCheck +  "is an Armstrong number");
        }else{
            System.out.println(numToCheck  + "is Not an Armstromg number");
        }
    }
    
}
