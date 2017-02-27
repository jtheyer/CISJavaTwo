/**
 * Page 490 #12.19
 * Count the number of words in Lincoln speech from given URL...
 *  http://cs.armstrong.edu/liang/data/Lincoln.txt
 *
 * @author Jason Heyer
 */
package Week4Ch12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class CountWords {

    private static int sumWords = 0;

    public static int countWords(String urlName)
            throws MalformedURLException, IOException {
        try {
            java.net.URL url = new java.net.URL(urlName);
            try{
            Scanner urlInput = new Scanner(url.openStream());
            while(urlInput.hasNext()){
                String words = urlInput.next();
                sumWords++;
            }
            } catch (IOException ex) {
            System.out.println("Invalid URL(MalURL)");
        }
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL(IO Ex)");
        }
        return sumWords;
    }

    public static void main(String[] args) throws MalformedURLException {
        try {
            System.out.println("There are " + countWords(""
                    + "http://cs.armstrong.edu/liang/data/Lincoln.txt"
                    + "") + " words in Abraham Lincoln's Gettysburg address.");
        } catch (IOException ex) {
            System.out.println("Invalid URL");
        } catch (Exception ex) {
            System.out.println("Invalid URL");
        }
    }
}
