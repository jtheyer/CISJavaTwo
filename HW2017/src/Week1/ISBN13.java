/**
 * Page 200 #5.47
 * Prompt User for ISBN-12 number as string, return ISBN-13 number.
 * @author Jason Heyer
 */
package Week1;

import java.util.Scanner;

public class ISBN13 {

    public static void main(String[] args) {
        System.out.print("Enter the first 12 digits of ISBN-13 as a string: ");
        Scanner input = new Scanner(System.in);
        String isbn = input.next();
        int sum = 0;

        if (isbn.length() != 12) {
            System.out.println(isbn + " is an invalid input");
        } else {
            for (int i = 0; i < isbn.length(); i++) {
                int num = Integer.parseInt(isbn.substring(i, i + 1));

                if ((i + 1) % 2 == 0) {//On even indexes do...
                    num *= 3;
                }
                sum += num;
            }
            int checksum = 10 - (sum % 10);
            if (checksum == 10) {
                checksum = 0;
            } //978013213080 & 79 
            System.out.println("The ISBN-13 number is " + isbn + checksum);
        }
    }
}
