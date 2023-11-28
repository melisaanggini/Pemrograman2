package soal1;

public class Sphere extends Shape {
    // radius in feet
    private double radius;

    //------------------------------------
    // Constructor Sets up the spere.
    //------------------------------------

    public Sphere (double r) {
        super ("Sphere");
        radius = r;
    }
    //------------------------------------
    // Returns the surface area of the sphere.
    //------------------------------------

    public double area () {
        return 4 * Math.PI * (radius*radius);
    }

    //------------------------------------
    // Return the spere as a String.
    //------------------------------------

    public String toString() {
        return super.toString() + " of radius " + radius;
    }
}
