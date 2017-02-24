/**
 * Page 489 #12.13
 * Count characters, words, and lines in a file.
 *
 * @author Jason Heyer
 */
package Week4Ch12;

import java.io.File;
import java.util.Scanner;

public class CountFromFile {
    
    public static void main(String[] args) throws Exception {
        int count = 0;
        //Create File instance
        java.io.File file = new java.io.File("FileCharSum.txt");
//        if (file.exists()) {
//            System.out.println("File already Exists");
//            System.exit(0);
//        }
        java.io.PrintWriter output = new java.io.PrintWriter("FileCharSum.txt");
            output.print("Things and stuff here... ");
            output.println("more things and stuff here on same line.");
        
        //Create Scanner for reading from " " file. 
        Scanner sc = new Scanner(new File("FileCharSum.txt"));
        
        //Use Scanner sc to read data from " " file. 
        while(sc.){
           count++;
        }
        System.out.println(count);
    }
}
