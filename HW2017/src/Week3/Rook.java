/**
 *
 * @author 55heyerjt01
 */
package Week3;

public class Rook extends Chessman {
        public Rook(String color){
            super(color);
        }
        
        @Override public String getName(){
            return "rook";
        }
        
        @Override
        public String getSymbol(){
            return color.equals("white") ? "r" : "R";
        }
        
        @Override
        public double getPoints(){
            return 5;
        }
}   