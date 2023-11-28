package soal1;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    //------------------------------------
    // Constructor: Sets up the cylinder.
    //------------------------------------

    public Cylinder (double r, double h) {
        super("Cylinder");
        radius = r;
        height = h;
    }

    //------------------------------------
    // Returns the surface area of the cylinder.
    //------------------------------------

    public double area() {
        return Math.PI * radius * radius * height;
    }

    //------------------------------------
    // Returns the cylinder as a String.
    //------------------------------------

    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}
