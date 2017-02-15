/**
 *
 * @author 55heyerjt01
 */
package Week3;

public class Dash extends Chessman {
     public Dash(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "dash";
    }

    @Override
    public String getSymbol() {
        return color.equals("white") ? "-" : "-";
    } 
    
    @Override 
    public double getPoints(){
        return 0;
    }
}
