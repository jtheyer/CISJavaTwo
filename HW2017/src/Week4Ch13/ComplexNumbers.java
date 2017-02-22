/**
 * Page 531 #13.17
 *  Class to work with Complex Numbers.
 * 
 *
 * @author Jason Heyer
 */
package Week4Ch13;

public class ComplexNumbers {
    public static void main(String[] args) {
        Complex num1 = new Complex(3.5, 5.5);
        //create another complex number and add them
    }
    
}

class Complex implements Cloneable{ 
    //typical complex number = a + b*i
    private double a; // real part
    private double b; // imaginary part

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    
    public Complex add(Complex c){
        return new Complex((a+c.getA()), (b+c.getB()));
    }
    
    public Complex subtract(Complex c){
        return new Complex((a-c.getA()), (b-c.getB()));
    }
//    public Complex multiply(Complex c){
//        return new Complex
//    }
}