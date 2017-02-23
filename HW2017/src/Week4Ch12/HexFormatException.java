/**
 * Page 489 #12.8
 * Hex Format Exception (Define Custom Exception)
 * Convert a hex string into a decimal number, throw a HexFormatException
 * if the string is not a hex string.
 *
 * @author Jason Heyer
 */
package Week4Ch12;

public class HexFormatException extends Exception {

    private String hex;

    public HexFormatException() {
        super("Invalid input, not a hex #");
    }

}
