/**
 * Run a number Guessing Game.
 * @author Jason Heyer
 */
package Week1;

import java.util.Scanner;

public class Guess {
     public static void main(String[] args) {
         System.out.print("Can you guess the correct number between 1 and 10? Guess: ");
            Scanner input = new Scanner(System.in);
            int guess = input.nextInt();
            int answer = 9; 
            
            while(guess != answer){
                System.out.print("Sorry, guess again: ");
                guess = input.nextInt();
            } 
            if (guess == answer){
                System.out.println("*~-._ Correct!!! _.-~* Great Guessing!");
            }
    }
}
