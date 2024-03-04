public class Armstrong {
    static boolean isArmstrong(int n){
        //Calculate the number of digits
        int numberOfDigits=String.valueOf(n).length();
        System.out.println(numberOfDigits);
        return true;

    }
    public static void main(String[] args) {
        isArmstrong(460088);
    }
    
}
