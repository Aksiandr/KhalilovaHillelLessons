package ClassWork;

public class Rectangle {

    double width = 4;
    double length = 5;

    static double  staticWidth = 2;
    static double staticLength = 14;

    public double getSquare() {
        return width * length;
    }

    public static double getSquareStatic(){

        return staticLength * staticLength;
    }
}
