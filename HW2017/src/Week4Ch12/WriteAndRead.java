/**
 * Page 489 #12.15
 * Write a file(if it doesn't exist); Create 100 random ints to write into file.
 * Ints are separated by spaces in file. Read the data back from file and
 * display th data in increasing order.
 *
 * @author Jason Heyer
 */
package Week4Ch12;

import static Week4Ch12.WriteAndRead.randNumString;
import java.util.Scanner;
import java.io.*;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.Random;

public class WriteAndRead {
    public static java.io.File file;
    public static ArrayList<Integer> myList = new ArrayList<>();
        //\\Make (x) amount of random ints spaced out in Array.
    public static int[] randNums(int amount){
        int[] nums = new int[amount];
        Random gen = new Random();
        for(int i = 0; i < amount; i++){
            nums[i] = gen.nextInt();
        }
        return nums;
    }
    //\\Make (x) amount of random ints(spaced) in a String.
    public static String randNumString(int amount){
        String s = "";
        for(int i = 0; i < amount; i++){
            s +=(int)(Math.random()*100) + " ";
        }
        return s;
    }
    //\\Makes a file with a myList of numbers in a String 
    public static void makeFile(int listSize, String fileName) throws Exception{
        //create file
        WriteAndRead.file= new java.io.File(fileName);
        if (file.exists()) {
            System.out.println(file + " exists...");
        }
         try {
            PrintWriter output = new java.io.PrintWriter(file);
            output.print(randNumString(listSize));
            output.close();
        } catch (Exception ex) {
            System.out.println("File not found");
        } 
    }
    //\\Reads String from file into an ArrayList<Integer> 
   public static void readFileToArrayList(String fileName)throws FileNotFoundException{
         try (Scanner sc = new Scanner(new File(fileName))) {
           String s = sc.nextLine();
           String[] split = s.split(" ");
           for( String number : split){
               int temp = parseInt(number);
               myList.add(temp);
           }
       }
       catch(FileNotFoundException ex){
           System.out.println("File not found");
       }
   }
   //\\Makes an ArrayList<Integer> into an int Array 
   public static int[] listToArray(){
      int[] myNums = new int[100];//100 for simplicity
      for(int i=0; i < 100; i++){
          myNums[i] = myList.get(i);
      }
      return myNums;
   }
    public static void main(String[] args) throws Exception {
       makeFile(100, "Ex12_15.txt");//Create file with 100 numbers (as String)
       readFileToArrayList("Ex12_15.txt"); //Read from file into an array
        System.out.println(myList);
        sort(myList);
        System.out.println(myList);
       //sortAsd(fileNums);//Sort the array in ascending order
        //Print array
    }
}