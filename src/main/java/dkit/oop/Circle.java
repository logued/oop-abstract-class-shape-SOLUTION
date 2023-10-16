package dkit.oop;

/**
 * Represents a Circle object and extends Shape.
 * Circle is a "concrete" class, as we can instantiate Circle objects.
 * Circle extends (inherits) from Shape, so creating an "is-a" relationship with Shape.#
 * So, Circle is also of type Shape via inheritance.
 * The area() method inherited from Shape is defined as "abstract" in Shape, so
 * it has no implementation
 * So, area() must be implemented in this Circle class, where we know how to write the code
 * to calculate the area of a circle.
 *
 * (The compiler will show an error until area() is implemented)
 */

public class Circle extends Shape {

    // fields x and y are inherited from the SHape superclass

    private int radius;     // additional fields specific to Circle

    public Circle(int x, int y, int radius) {
        super(x, y); //calls the superclass constructor to initialize x and y.
        this.radius = radius;
    }

    /**
     * Implement the inherited abstract getArea() method
     * (this must be implemented, otherwise an error is reported)
     *
     * @return area of a circle
     */
    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    // add some getter and setters to access the field defined in Circle
    // Note that the getters and setters for x and y fields are inherited from Shape
    // and so it is possible to call getX() on a Circle typ eobject
    //
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        // call superclass toString method to get Shape details
        return super.toString() + "[radius=" + this.radius + "]";
        // note that we can't directly access the values of x and y from this class, because
        // they are defined as private in the Shape superclass. So, we let the toString() of Shape
        // do the work for us, as it can access x and y.
    }

}
