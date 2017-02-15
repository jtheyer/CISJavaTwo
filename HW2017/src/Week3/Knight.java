/**
 *
 * @author 55heyerjt01
 */
package Week3;

public class Knight extends Chessman {

    public Knight(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "knight";
    }

    @Override
    public String getSymbol() {
        return color.equals("white") ? "k" : "K";
    }

    @Override
    public double getPoints() {
        return 3;
    }
}

