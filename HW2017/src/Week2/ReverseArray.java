/**
 * Page 278 #7.12
 * Reverse an array storing prompted values.
 *
 * @author Jason Heyer
 */
package Week2;

import java.util.Scanner;

public class ReverseArray {
    //Create method to reverse passed in array
    public static int[] reverseArray(int[] numList) {
        int[] result = new int[numList.length];
        for (int i = 0, j = result.length - 1; i < numList.length; i++, j--) {
            result[j] = numList[i];
        }
        return result;
    }

    public static void main(String[] args) {
        //Prompt user to enter 10 numbers (ints)
        System.out.print("Start your 10 number List here: ");
        Scanner input = new Scanner(System.in);
        int[] numList = new int[10];
        //"Current input number" counter
        int counter = 1;
        
        for (int i = 0; i < numList.length; i++) {
            numList[i] = input.nextInt();
            counter++;
            if(counter == 11){break;}
            System.out.print("Number " + counter + " is: ");
        }
        //Print out reversed array
        int[] numList2 = reverseArray(numList);
        for (int i = 0; i < numList.length; i++) {
            System.out.print(numList2[i] + " ");
        }
        
    }
}
