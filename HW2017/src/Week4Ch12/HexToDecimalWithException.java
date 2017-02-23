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

public class HexToDecimalWithException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        do {
            try {
                System.out.print("Input hex string here: ");
                String hex = input.next();
                System.out.println("Decimal value for hex number is: " + HexToDecimalWithException(hex.toUpperCase()));
                continueInput = false;
            } catch (HexFormatException ex) {
                System.out.println(ex);
                input.nextLine();
            }
        } while (continueInput);
    }
    //Initial hex to decimal constructor
    public static int HexToDecimalWithException(String hex)
            throws HexFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch) throws HexFormatException {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else if (ch >= '0' && ch <= '9') {
            return ch - '0';
        }else {
            throw new HexFormatException();
        }

    }

}
