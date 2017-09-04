package edu.macalester.comp124.hw0;

/**
 * @author Sun Gyu Park
 */
public class Area {
    /**
     * Calculates the area of a square.
     * @param sideLength The length of the side of a square
     * @return The area
     */
    public static double getSquareArea(double sideLength) {
        return Math.pow(sideLength,2.0);  //side Length times side length is an area of a square;
    }

    /**
     * Calculates the area of a circle.
     * @param radius The radius of the circle
     * @return The area
     */
    public static double getCircleArea(double radius) {
        return Math.pow(radius,2.0) * Math.PI; // Radius squared times Pi
    }

}
