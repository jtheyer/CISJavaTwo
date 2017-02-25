/**
 * Page 489 #12.15
 * Write a file(if it doesn't exist); Create 100 random ints to write into file.
 * Ints are separated by spaces in file. Read the data back from file and
 * display th data in increasing order.
 *
 * @author Jason Heyer
 */
package Week4Ch12;

import java.util.Scanner;
import java.io.*;

public class WriteAndRead {

    public static void main(String[] args) throws FileNotFoundException {
        //create file
        java.io.File file = new java.io.File("Exercise12_15.txt");
//    Scanner inputFile = new Scanner(file);
        PrintWriter output = new java.io.PrintWriter(file);
        output.print("test");
        output.close();

    }
}
