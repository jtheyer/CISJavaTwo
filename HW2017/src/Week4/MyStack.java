/**
 * Page 447 #11.10 
 * Extend ArrayList to MyStack
 * @author jason
 */
package Week4;

import java.util.ArrayList;
import java.util.Scanner;

public class MyStack extends ArrayList{
    public static ArrayList<Object> list = new ArrayList<>(); 
    @Override
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public int getSize(){
       return list.size();
    }
    public Object peek(){
        return list.get(getSize()-1);
    }
    public Object pop(){
        Object o = list.get(getSize()-1);
        list.remove(getSize()-1);
        return o;
    }
    public void push(Object o){
    list.add(o);
    }
    public static Object reverseArrayList(ArrayList<Object> list){
        ArrayList<Object> reverseList = new ArrayList<>();
        for(int i = list.size()-1; i > -1; i--){
            reverseList.add(list.get(i));
        }
        return reverseList;
    }
    @Override
    public String toString(){
        return "stack: "+ list.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string 1 (of 5) here: ");
        list.add(input.nextLine());
        System.out.print("2 (of 5): ");
        list.add(input.nextLine());
        System.out.print("3 (of 5): ");
        list.add(input.nextLine());
        System.out.print("4 (of 5): ");
        list.add(input.nextLine());
        System.out.print("5 (of 5): ");
        list.add(input.nextLine());
        
        System.out.println(reverseArrayList(list).toString());
        
    }
}
