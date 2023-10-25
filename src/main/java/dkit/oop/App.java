package dkit.oop;   // Oct 2023    SOLUTION

import java.util.ArrayList;

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
        Rectangle r1 = new Rectangle(4,5,20,35);
        System.out.println(r1);

        //TODO
        // create an ArrayList and populate it with two Circles and two Rectangles.
        // write a displayList() method that accepts the list and display all elements.
        // using a for loop, sum the area of all the shapes and output that sum.
        ArrayList<Shape> shapesList = new ArrayList<>();
        shapesList.add( new Circle(2,3,10));
        shapesList.add( new Circle(3,4,12));
        shapesList.add( new Rectangle(4,8,30,25));
        shapesList.add( new Rectangle(12,14,15,25));

        displayShapes( shapesList );
        double totalArea = sumOfAreas( shapesList );
        System.out.println("Sum of shape areas :" + totalArea);

        //TODO
        // The senior architect informs you that all shapes MUST have a method
        // called perimeter() that returns the perimeter of the shape.
        // Make the appropriate changes to the Shape, Circle and Rectangle classes.

        //SOLUTION
        // write an abstract method called perimeter() in Shape with no implementation (body)
        // override the perimeter() method in all subclasses
        // use a loop in App main to display the perimeters of all the shapes in the list
    }

    public double sumOfAreas( ArrayList<Shape> list) {
        double sum = 0.0;
        for(Shape shape : list)
            sum = sum + shape.area();

        return sum;
    }

    public void displayShapes( ArrayList<Shape> list) {
        for( Shape shape : list )
            System.out.println(shape);
    }


}
