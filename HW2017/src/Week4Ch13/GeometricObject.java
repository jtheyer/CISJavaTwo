/**
 * Page 529 #13.1
 * (Triangle Class) Design Triangle class that extends the abstract
 * GeometricObject class.
 *
 * @author Jason Heyer
 */
package Week4Ch13;

public abstract class GeometricObject {

    protected String color = "white";
    protected boolean filled;
    protected java.util.Date dateCreated;

    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }
    //return Geometric object w/ color and filled data

    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    //return color

    public String getColor() {
        return color;
    }
    //set new color

    public void setNewColor(String color) {
        this.color = color;
    }
    //return filled boolean 

    public boolean isFilled() {
        return filled;
    }
    //set filled

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    //get date created
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    
    public abstract int getArea();
    public abstract int getPerimeter();

    
    public String toString() {
        return "GeometricObject{" + "color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + '}';
    }
    
    
    
}
