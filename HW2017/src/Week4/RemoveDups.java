/**
 * Page 447 #11.12
 * Remove duplicates from an Integer ArrayList. (not working)
 *
 * @author jason
 */
package Week4;

import java.util.ArrayList;

public class RemoveDups {

    public static void removeDuplicates(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int temp = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                if(list.contains(temp)){
                    list.remove(j);
                }
            }
        }
    }
}
