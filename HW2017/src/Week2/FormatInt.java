/**
 * Page 243 #6.37
 * Format an integer with specified width.
 *
 * @author Jason Heyer
 */
package Week2;

import java.util.Scanner;

public class FormatInt {

    /*Test cases:
    *   format(34, 4) returns 0034
    *   format(34, 5) returns 00034
    *   format(34, 1) returns 34
     */
    
    //Create method to format the number
    public static String format(int num, int width) {
        String result = "" + num;
        if (result.length() < width) {
             int zeros = width - result.length();
            for(int i=0; i<zeros; i++ ){
            result = "0" + result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //Prompt for integer
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to format here: ");
        int num = input.nextInt();

        //Prompt for number width
        System.out.print("Specify width: ");
        int width = input.nextInt();
        //Return String invoking format(number, width)
        System.out.print("The formatted number is: " + format(num, width));
    }
}
