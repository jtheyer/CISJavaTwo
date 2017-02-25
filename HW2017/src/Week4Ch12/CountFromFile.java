/**
 * Page 489 #12.13
 * Count characters, words, and lines in a file.
 *
 * @author Jason Heyer
 */
package Week4Ch12;

import java.io.*;
import java.util.Scanner;

public class CountFromFile {

    public static void main(String[] args) throws IOException {

        //Create File instance
        java.io.File file = new java.io.File("FileCharSum.txt");

        //Write to the file
        PrintWriter output = new java.io.PrintWriter(file);
        output.print("Test test ");
        output.println("more test");
        output.close();

        //Create Scanner for reading from " " file.
        //and work the problem...
        int lines = 0;
        int words = 0;
        int chars = 0;

        try (Scanner inputFile = new Scanner(file);) {
            while (inputFile.hasNext()) {
                String s = inputFile.nextLine();
                lines++;
                chars = s.length();
                String[] split = s.split(" ");
                for (String word : split) {
                    words++;
                }
            }
            System.out.println("There are |" + chars + "| characters.");
            System.out.println("There are |" + words + "| words.");
            System.out.println("There are |" + lines + "| lines.");

        }
    }
    //Use Scanner sc to read data from " " file. 
    // Scanner fileInput = new Scanner(file);

}
