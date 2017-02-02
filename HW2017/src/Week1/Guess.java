/**
 * Run a number Guessing Game.
 *
 * @author Jason Heyer
 */
package Week1;

import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {
        System.out.print("What is the correct number between 1 and 10? Guess: ");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        int answer = (int)(Math.random() * 10);

        while (guess != answer) {
            if (guess < answer) {
                System.out.print("Too low, guess a bigger number: ");
                guess = input.nextInt();
            }else {
                System.out.print("Too big, guess a lower number: ");
                guess = input.nextInt();
            }
        }
        System.out.println("*~-._ Correct!!! _.-~* Great Guessing!");
    }

}

