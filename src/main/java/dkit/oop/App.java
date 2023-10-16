package dkit.oop;   // Oct 2023

/**
 * Abstract class Shape
 * oop-abstract-class-shape
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Abstract Class Shape" );
        App app = new App();
        app.start();
    }

    public void start() {

        // We cannot create an object of an Abstract class.
        // (ie we cannot instantiate an Abstract class)
        //  Shape s1 = new Shape(2,3); // uncomment and note the compiler error message.
        //
        // This is sensible, because an abstract class is supposed to represent an abstraction
        // of a class of objects that stores only things common to all objects,
        // but not the full structure of any actual object types.

        Circle c1 = new Circle(1,2,5);  // instantiate a "concrete" class
        System.out.println(c1.toString());

        // The following code calls getX() and getY() on a Circle type object c1
        // These methods exist for c1, because they have been inherited in Circle
        // from the Shape class.
        System.out.println("Circle c1: x=" + c1.getX() + ", y="+c1.getY());


        //TODO
        // implement the Rectangle class (see skeleton Rectangle class).
        // instantiate a Rectangle object r1, and output its details.

        //TODO
        // create an ArrayList and populate it with two Circles and two Rectangles.
        // write a displayList() method that accepts the list and display all elements.
        // using a for loop, sum the area of all the shapes and output that sum.

        //TODO
        // The senior architect informs you that all shapes MUST have a method
        // called perimeter() that returns the perimeter of the shape.
        // Make the appropriate changes to the Shape, Circle and Rectangle classes.
    }
}
