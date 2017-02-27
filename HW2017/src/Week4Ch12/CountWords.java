/**
 * Page 488 #12.3
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
//    private static int words;
    public static int countWords(String urlName) throws MalformedURLException, IOException{
          java.net.URL url = new java.net.URL(urlName);
          Scanner urlInput = new Scanner(url.openStream());
          int words = 0;
          return words;
    
    }
    
    public static void main(String[] args)throws MalformedURLException  {
        try { System.out.println("There are " + countWords(""
                + "http://cs.armstrong.edu/liang/data/Lincoln.txt"
                + "") + " words in Abraham Lincoln's Gettysburg address.");
        }catch(IOException ex){
           System.out.println("Invalid URL");
       }catch(Exception ex){
           System.out.println("Invalid URL");
       }
    }
}
