/**
 * Page 291
 * User initialized multidimensional array with sums for columns (and rows).
 *
 * @author Jason Heyer
 */
package Week3;

import java.util.Scanner;

public class SumColumns {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[2][4];
        System.out.println("Enter " + matrix.length + " rows and "
                + matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        //Print elements
        System.out.print("Each element w/ sum: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
        }

        //Sum all elements 
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];
            }
        }
        System.out.println("= " + total);

        //Sum Columns
        for (int column = 0; column < matrix[0].length; column++) { //matrix[0]Keeps it on first row
            int sumCol = 0;
            for (int row = 0; row < matrix.length; row++) {
                sumCol += matrix[row][column];

            }
            System.out.println("Sum for Column " + (column + 1) + " is " + sumCol);// add col + 1 to logically sync 
        }

        //Sum Rows (Which row has largest sum)
        int maxRow = 0; //sum of row (biggest row)
        int indexOfMaxRow = 0;//index of that row(maxRow) with biggest sum
        //Get sum of first row in maxRow 
        for (int col = 0; col < matrix[0].length; col++) {
            maxRow += matrix[0][col];
        }

        for (int row = 1; row < matrix.length; row++) {
            int thisRowTotal = 0;
            for(int col =0; col < matrix[row].length; col++)
                thisRowTotal += matrix[row][col];
            if (thisRowTotal > maxRow){
                maxRow = thisRowTotal;
                indexOfMaxRow = row;
            }
        }
        System.out.println("Row "+ (indexOfMaxRow + 1) + " has the largest total of : " +
                maxRow);
    }
}
