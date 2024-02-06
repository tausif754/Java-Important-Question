
import java.util.Scanner;
public class ReverseString {

    public static String reverse(String s) {
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            // Swap characters at start and end indices
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }

        // Convert the character array back to a String
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        String reversedString = reverse(inputString);
        System.out.println("Reversed string: " + reversedString);
    }
}
