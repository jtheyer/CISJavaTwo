/**
 * Page 488 #12.3
 * Array index out of bounds exception
 * Create array w/ 100 random #'s, prompt for index and
 *  return corresponding element.
 *
 * @author Jason Heyer
 */
package Week4Ch12;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayiOutOfBoundEx {

    public static int returnIndex (ArrayList<Integer> list, int index) {
        index = list.get(index);
        return index;
    }

    public static void main(String[] args) {
        boolean continueInput = true;
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int e = (int) (Math.random() * 100);
            list.add(e);
        }
        System.out.println(list);
        do{
            try{
            System.out.print("Choose an element index: ");
            int index = input.nextInt();
            System.out.println(returnIndex(list, index));
            continueInput = false;
            }catch(IndexOutOfBoundsException ex){
                System.out.println("Out of Bounds (" + ex.getMessage()+")");
                input.nextLine(); //Discard input
            }
        }while(continueInput);
    }
}
