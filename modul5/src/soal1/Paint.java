package soal1;

public class Paint {
    // number of square feet per gallon
    private double coverage;

    //------------------------------------
    // Constructor: Sets up the pant object
    //------------------------------------

    public Paint (double c) {
        coverage = c;
    }

    //------------------------------------
    // Returns the amount of paint (number of gallons)
    // needed to paint the shape given as the parameter.
    //------------------------------------

    public double amount (Shape s) {
        System.out.println("Computing amount for " + s );
        return s.area() /coverage;
    }
}
