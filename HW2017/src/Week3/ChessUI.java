/**
 * Create a chess board (8x8)
 *
 * @author Jason Heyer
 */
package Week3;

import java.util.Scanner;

public class ChessUI {

    ChessBoard myBoard;
    Scanner input = new Scanner(System.in);

    // outerLoop: //This is a label 
    //code
    public ChessUI() {
        String playMore = "y";
        while (playMore.equalsIgnoreCase("y")) {
            myBoard = new ChessBoard();
            playGame();
            System.out.println("\nPlay another game (y/n)?");
            playMore = input.nextLine();
        }
    }
    /**
     * Loop for a chess game. 
     * @param args 
     */
    public final void playGame(){
        boolean gameOver = false; 
        String from, to;
        int count = 0;
        System.out.println(myBoard);
        // loop until game over
        while(!gameOver){
            if(count % 2 == 0){
                System.out.println("Turn: White");
            } else {
                System.out.println("Turn: Black");
            }
        
        //loop until valid move is entered or user quits
        while(true){
                System.out.print("Location of Chessman to move(e.g. h2): ");
                from = input.nextLine();
                System.out.print("Chessman's destination(e.g. h4): ");
                to = input.nextLine();
                if (!(ChessBoard.isValidPosition(from) && ChessBoard.isValidPosition(to))) {
                    System.out.println("Invalid position(s). Please try again.");
                    continue;
                }
                System.out.println("Do you want to move your "
                        + myBoard.getPiece(from).getName()
                        + " from " + from + " to " + to + "?");
                System.out.print("y for yes or r to redo or q to quit game: ");
                String choice = input.nextLine();
                if (choice.equalsIgnoreCase("y")) {
                    break;
                } else if (choice.equalsIgnoreCase("q")) {
                    gameOver = true;
                    break;
                }
        }
        //Make move and display board
        myBoard.move(from, to);
            System.out.println(myBoard);
            count++;
        } 
    }
//        while(true){
//        if(choice.equalsIgnoreCase("y")) {
//            break;
//        }else if (choice.equalsIgnoreCase("q")){
//            break outerLoop;// will break to outer loop instead of getting stuck inside first while loop
//        }
//        }
    public static void main(String[] args) {
        ChessUI game = new ChessUI();
    }
}
