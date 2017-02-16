/**
 *
 * @author 55heyerjt01
 */
package Week3;


public class Bishop extends Chessman {
    public Bishop(String color){
        super(color);
    }
    
    @Override 
    public String getName(){
        return "bishop";
    } 
    
    @Override 
    public String getSymbol(){
        return color.equals("white") ? "b" : "B";
    }
    
    @Override 
    public double getPoints(){
        return 3.5;
    }
}
