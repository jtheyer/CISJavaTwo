/**
 * Count vowels and consonants
 *
 * @author Jason Heyer
 */
package pkg5pt49page200;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        int vows = 0;
        int cons = 0;
        int space = 0;
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (temp == 'a' 
             || temp == 'e' 
             || temp == 'i'
             || temp == 'o' 
             || temp == 'u') {
                vows++;
            }else if(str.charAt(i)== ' '){
                space++;
            }else{
                cons++;
            }
        }
        System.out.println("The number of vowels is " + vows);
        System.out.println("The number of consonants is " + cons);
    }

}
