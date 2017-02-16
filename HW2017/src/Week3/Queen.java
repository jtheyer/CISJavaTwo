/**
 *
 * @author 55heyerjt01
 */
package Week3;

public class Queen extends Chessman {
    public Queen(String color){
        super(color);
    }
    
    @Override
    public String getName(){
        return "queen";
    }
    
    @Override
    public String getSymbol(){
        return color.equals("white") ? "q" : "Q";
    }
    
    @Override
    public double getPoints(){
        return 9;
    }
}
