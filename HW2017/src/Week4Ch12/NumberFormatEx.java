/**
 * Page 489 #12.6
 * Number Format Exception
 * Convert a hex string into a decimal number, throw a NumberFormatException
 * if the string is not a hex string.
 *
 * @author Jason Heyer
 */
package Week4Ch12;

import java.util.Scanner;

public class NumberFormatEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input hex string here: ");
        int hex = input.nextInt();
    }
}
