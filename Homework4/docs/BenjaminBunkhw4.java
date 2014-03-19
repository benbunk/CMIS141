
/*
 * @Title:   Homework 4
 * @Author:  Benjamin Bunk
 * @Date:    March 16th, 2014
 * Purpose: This program will display the volume and surface area of a cylinder.
 */

/**
 * This is the main class for Homework 4.
 */
public final class BenjaminBunkhw4 {

    /**
     * Private constructor for our Utility class.
     */
    private BenjaminBunkhw4() {
        // Not Called.
    }

    /**
     *
     * The main entry point to the program.
     *
     * This method initiates all INPUT/OUTPUT/CALCULATIONS.
     *
     * @param args The array of String arguments passed in at runtime.
     *
     */
    public static void main(final String[] args) {

        // Create a new cylinder with the radius of 2 and the height of 5.
        Cylinder myCylinder = new Cylinder(.0001, .0002);

        /////////////////INPUT SECTION///////////////////////////////
        // None.

        /////////////////CALCULATION SECTION/////////////////////////
        // None.

        /////////////////OUTPUT SECTION//////////////////////////////

        // Display the volume and surface area of the cylinder.
        System.out.println("The Surface area of the cylinder is: " 
                            + myCylinder.getSurfaceArea());

        System.out.println("The volume of the cylinder is: "
                            + myCylinder.getVolume());

    } // End method main.

} // End class BenjaminBunkhw4.


/**
 * The Cylinder class represents a circular cylinder.
 */
class Cylinder {

    /**
     * Represents the radius of the cylinder.
     * Currently set to {@value}
     */
    private double radius;

    /**
     * Represents the height of the cylinder.
     * Currently set to {@value}
     */
    private double height;

    /**
     * Public No-Arg constructor for a Cylinder with 1.0 radius and 1.0 height.
     */
    public Cylinder() {
        radius = 1.0;
        height = 1.0;
    } // End no-arg constructor.

    /**
     * Public constructor for a Cylinder with client provided radius and height.
     *
     * @param r Sets the radius of the circular cylinder.
     * @param h Sets the height of the cylinder.
     */
    public Cylinder(double r, double h) {
        radius = r;
        height = h;
    } // End constructor.

    /**
     * Get the total surface area of this cylinder.
     *
     * @return Double representing the surface area.
     */
    public double getSurfaceArea() {
        // Surface Area = 2 * PI * radius * (radius + height)
        return (getSufaceAreaEnd() * 2) + getSurfaceAreaSide();
    } // End method getSurfaceArea.

    /**
     * Get the surface area of one circular end of this cylinder.
     *
     * @return Double representing the surface area.
     */
    public double getSufaceAreaEnd() {
        // PI x Radius^2
        return Math.PI * Math.pow(radius, 2);
    } // End method getSurfaceAreaEnd.

    /**
     * Get the surface area of the side of this cylinder.
     *
     * @return Double representing the surface area.
     */
    public double getSurfaceAreaSide() {
        // 2 * PI * radius * height
        return 2 * Math.PI * radius * height;
    } // End method getSurfaceAreaSide.

    /**
     * Get the volume of this cylinder.
     *
     * @return Double representing the volume.
     */
    public double getVolume() {
        // PI * Radius^2 * Height
        return Math.PI * Math.pow(radius, 2) * height;
    } // End method getVolume.

} // End class BenjaminBunkhw4.
