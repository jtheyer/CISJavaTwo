/**
 *
 * @author 55heyerjt01
 */
package Week3;


public class King extends Chessman{
    public King(String color){
        super(color);
    }
    
    @Override
    public String getName(){
        return "king";
    } 
    
    @Override 
    public String getSymbol(){
        return color.equals("white") ? "k" : "K";
    }
    
    @Override 
    public double getPoints(){
        return 2;
    }
}