/**
 * Page 491 #12.24
 * Create a large dataset. 1,000 lines. Each line in file has faculty member's
 * first name, last name, rank, and salary.
 *
 * @author Jason Heyer
 */
package Week4Ch12;

import java.util.ArrayList;
import java.util.Random;
import java.io.*;

public class LargeDataset {
    
public static java.io.File file;

public static void makeFile(int listSize, String fileName) throws Exception{

        //create file
        LargeDataset.file= new java.io.File(fileName);
        if (file.exists()) {
            System.out.println(file + " exists...");
        }
         try {
            PrintWriter output = new java.io.PrintWriter(file);
            output.print(faculty(listSize));
            output.close();
        } catch (Exception ex) {
            System.out.println("File not found");
        } 
    }
public static String faculty(int listSize){
    
    return person;
}
    public static void main(String[] args) {
//        createFaculty(1000);
        
    }
}

/*
String firstName, String lastName, String rank, 
                double salary

            this.fName = firstName;
            this.lName = lastName;
            this.rank = rank; 
            this.salary = salary;

 for (int j = 0; j < amountToCreate; j++) {
                
            }


    static class Employee {

        protected String fName;
        protected String lName;
        protected String rank;
        protected double salary;

        public Employee() {
        }

        public Employee(String fName, String lName, String rank, double salary) {
            this.fName = fName;
            this.lName = lName;
            this.rank = rank;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" + "fName=" + fName + ", lName=" + lName + ", rank=" + rank + ", salary=" + salary + '}';
        }
    }
    public static String employeeGenerator(){
        Random num1 = new Random();
        Random num2 = new Random();
        Random num3 = new Random();
        Random num4 = new Random();
        return person;
    }

    public String createFacultyList(int amountToCreate) {
        Random rand = new Random();
        ArrayList<Object> facultyMembers = new ArrayList<>(amountToCreate);
        for (int i = 0; i < amountToCreate; i++) {
           facultyMembers.add(employeeGenerator());
        }
        return facultyMembers;
    }


****Main****
Employee e1 = new Employee("asd", "asdf", "ran", 233.33);
        System.out.println(e1.toString());
 */
