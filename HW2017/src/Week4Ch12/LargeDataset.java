/**
 * Page 491 #12.24
 * Create a large dataset. 1,000 lines. Each line in file has faculty member's
 * first name, last name, rank, and salary.
 *
 * @author Jason Heyer
 */
package Week4Ch12;


import Week4.Person;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

public class LargeDataset extends Person{

    public static java.io.File file;
    protected static String name;
    protected static Object personX;
    public static void makeFile(int listSize, String fileName){

        try{ //create file
        LargeDataset.file = new java.io.File(fileName);
        if (file.exists()) {
            System.out.println(file + " exists...");
        }
        }catch(Exception ex){
            System.out.println("Caught exception..." + ex.toString());
        }
            try (PrintWriter output = new java.io.PrintWriter(file)) {
                for(int i =0; i < listSize; i++){
                output.println(createFaculty(listSize));
                }
            } catch (Exception ex) {
                System.out.println("File not found");
            }
        }
//create x amount of people where x is listSize
    public static String createFaculty(int listSize) {
        for(int i=0; i < listSize; i++){
       LargeDataset.name = "FacultyMember_"+i+"";
        Person person = new Person(name, i+" main st", "867-5309", "bub"+i+"@yahoo.com");
        personX = person.toString();
        
        }
           return personX.toString();
    }

    public static void main(String[] args) {
        makeFile(1000, "largeDataset.txt");
        createFaculty(1000);
    }
}