/**
 * Page 445 #11.4 (Return highest value in an ArrayList of Integers)
 *
 * @author jason
 */
package Week4;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxElementArray {

    private static int max = 0;

    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty() || list.indexOf(0) == 0) {
            return null;
        }
        for (int i = 1; i < list.size() - 1; i++) {
            if (max < list.indexOf(i)) {
                max = list.get(i);
            }

        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numsList = new ArrayList<>();

        System.out.print("Enter numbers greater than 0 (use 0 to end number"
                + " input sequence): ");
        int num = input.nextInt();
        while (num != 0) {
            numsList.add(num);
            num = input.nextInt();
        }
        System.out.println(numsList.toString());
        System.out.println(max(numsList));
    }

}
