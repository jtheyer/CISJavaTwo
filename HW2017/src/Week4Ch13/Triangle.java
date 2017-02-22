/**
 * Page 529 #13.1
 * (Triangle Class) Design Triangle class that extends the abstract
 * GeometricObject class.
 *
 * @author Jason Heyer
 */
package Week4Ch13;

public class Triangle extends GeometricObject {

    int base;
    int height;
    int hypotenuse;
    
    public Triangle(){
        
    }
    public Triangle(int a, int b, int c, String color, boolean filled){
        super(color, filled);
        this.base = a;
        this.height = b;
        this.hypotenuse = c;
    }

    public void setBase(int a) {
        this.base = a;
    }

    public int getBase() {
        return base;
    }

    public void setHeight(int b) {
        this.height = b;
    }

    public int getHeight() {
        return height;
    }

    public void setHypotenuse(int c) {
        this.hypotenuse = c;
    }

    public int getHypotenuse() {
        return hypotenuse;
    }

    @Override
    public int getArea() {
        return (base * height)/2;
    }

    @Override
    public int getPerimeter() {
        return base+height+hypotenuse;
    }

    @Override
    public String toString() {
        return "Triangle created on: "+ getDateCreated() +".\nColor of: " + 
                color + ".\n" + "Is filled? " + isFilled();
    }
    
}
