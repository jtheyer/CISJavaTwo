/**
 * Page 529 #13.1
 * (Triangle Class) Design Triangle class that extends the abstract 
 * GeometricObject class.
 *
 * @author Jason Heyer
 */
package Week4Ch13;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input for triangle info + sides a, b, & c...");
        System.out.print("a(base) =  ");
        int a = input.nextInt();
        System.out.print("b(height) = ");
        int b = input.nextInt();
        System.out.print("c(hypotenuse) = ");
        int c = input.nextInt();
        System.out.print("Color of triangle: ");
        String color = input.next();
        System.out.print("Do you want the triangle filled? (y/n?): ");
        boolean fill = false;
        if(input.hasNext("y")){
            fill = true;
        }
        
        GeometricObject tri1 = new Triangle(a, b, c, color, fill);
        
        System.out.println(tri1.toString());
        System.out.println("Area of Triangle is: " + tri1.getArea());
    }
}
