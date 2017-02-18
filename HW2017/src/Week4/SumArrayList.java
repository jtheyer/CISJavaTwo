/**
 * Page 447 #11.12 
 * Display the sum of an ArrayList.
 * @author jason
 */
package Week4;

import java.util.ArrayList;

public class SumArrayList {
    public static double sum(ArrayList<Double> list){
        double sum = 0;
        for(int i = 0; i < list.size(); i++){
           sum += list.indexOf(i);
        }
        return sum;
    }
}
