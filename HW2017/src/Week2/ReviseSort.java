/**
 * Page 280 #7.20
 * Revise selection sort to find the largest number and swap it with the last.
 *
 * @author Jason Heyer
 */
package Week2;

public class ReviseSort {
    //Revised sort method
    public static void reviseSort(double[] list) {
         for (int lastIndex = list.length - 1; lastIndex > 0; lastIndex--) {
            double currentMax = list[lastIndex];
            int currentMaxIndex = lastIndex;
            for (int currentIndex = 0; currentIndex <= lastIndex; currentIndex++) {
                if (list[currentIndex] > currentMax) {
                    currentMax = list[currentIndex];
                    currentMaxIndex = currentIndex;
                }
            }
            if (currentMaxIndex != lastIndex) {
                list[currentMaxIndex] = list[lastIndex];
                list[lastIndex] = currentMax;
            }
        }
    }
    //Display method prints arg to screen
    public static void display(double[] list){
        for(double e : list){
            System.out.print(e + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        //Declare array of doubles
        double[] numList = {10.5, 7.3, 16.8};
        //Print the list, sort in background, reprint list(sorted)
        display(numList);
        reviseSort(numList);
        display(numList);
    }
}
