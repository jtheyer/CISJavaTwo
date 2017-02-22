/**
 * Page 489 #12.8
 * Hex Format Exception (Define Custom Exception)
 * Convert a hex string into a decimal number, throw a HexFormatException
 * if the string is not a hex string.
 *
 * @author Jason Heyer
 */
package Week4Ch12;

import java.util.Scanner;

public class HexFormatException {
    
    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        if (hex.length() != 4) 
            throw new IllegalArgumentException();
        
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else {
            return ch - '0';
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        do {
            try {
                System.out.print("Input hex string here: ");
                String hex = input.next();
                System.out.println("Decimal value for hex number is: " + hexToDecimal(hex.toUpperCase()));
                continueInput = false;
            } catch (IllegalArgumentException ex) {
                System.out.println("Exception: Not a hex string!");
                input.nextLine();
            }
        } while (continueInput);
    }
}