/**
 * Page 244 #6.38
 * Generate random characters.
 *
 * @author Jason Heyer
 */
package Week2;

public class RandomChars {

    //Get random character
    public static char getRandChar(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    //Generate random uppercase char
    public static char getRandUpCase() {
        return getRandChar('A', 'Z');
    }

    //Generate random digit char
    public static char getRandDigit() {
        return getRandChar('0', '9');
    }

    public static void main(String[] args) {
        //print 100 single digits @ 10 per line.
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(getRandDigit());
            }
            System.out.println("");
        }
        //print 100 uppercase letters
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(getRandUpCase());
            }
            System.out.println("");
        }
    }
}
