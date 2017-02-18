/**
 * Page 447 #11.14
 * Combine two lists.
 *
 * @author jason
 */
package Week4;

import java.util.ArrayList;

public class CombineLists {
    public static ArrayList<Integer> union(ArrayList<Integer> list1,
            ArrayList<Integer> list2){
        list1.addAll(0, list2);
        return list1;
    }
}
