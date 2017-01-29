/**
 *
 * @author Jason Heyer
 */
package pkg5pt46page200;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your string here: ");
        Scanner input = new Scanner(System.in);
        String lett = input.next();
        System.out.println("You entered: " + lett);
        String reverse = "";
        
        for(int i = lett.length()-1; i >= 0; i--){
            reverse += lett.charAt(i);
        }
        System.out.println("Your string reversed is: "+ reverse);
    }
    
}
