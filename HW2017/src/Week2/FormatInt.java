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
    public static void main(String[] args) {
        //Prompt for integer
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to format here: ");
        String num = input.next();
        
        //Prompt for number width
        System.out.print("Specify width: ");
        int width = input.nextInt();
        //Return String invoking format(number, width)
        System.out.print("The formatted result is: " + num);
    }
    //Format the number
    
    public static int format(String num, int width) {
        int addZeros = width; //Number of zeros to add on to num
        if(width > num.length()){
            num.append('0');
        }
        return result;
    }
}
