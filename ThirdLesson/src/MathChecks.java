import java.util.Scanner;

public class MathChecks {
    public static void main(String[] args) {
        // S = π * r2
        // S = a * a

        Scanner in = new Scanner(System.in);

        System.out.println("Enter circle area: ");
        double circleArea = in.nextDouble();

        System.out.println("Enter square area: ");
        double squareArea = in.nextDouble();

        double squareSide = calculateSquareSide(squareArea);
        double circleRadius = calculateCircleRadius(circleArea);
        double squareDiagonal = calculateSquareDiagonal(squareArea);

        if (checkIfCircleCouldBeInscribedInSquare(circleRadius, squareSide)){
            // circleArea = 18.75 and squareArea = 25
            System.out.println("The circle could be inscribed in square");
        }
        else if (checkIfSquareCouldBeInscribedInCircle(squareDiagonal, circleRadius)){
            // circleArea = 12 and squareArea = 10
            System.out.println("The circle could be drawn around square");
        } else {
            System.out.println("The circle couldn't be drawn around square as well as " +
                    "The circle couldn't be inscribed in square");
        }
    }

//    private static double calculateCircleArea(double circleRadius){
//        return Math.round(Math.PI) * circleRadius * circleRadius;
//    }

    private static double calculateCircleRadius(double circleArea){
        return Math.sqrt(circleArea / Math.round(Math.PI));
    }

    private static double calculateSquareSide(double squareArea){
        return Math.sqrt(squareArea);
    }

    private static double calculateSquareDiagonal(double squareArea){
        return Math.round(Math.sqrt(squareArea + squareArea));
    }

    private static boolean checkIfCircleCouldBeInscribedInSquare(double radius, double side){
        return 2 * radius == side;
    }

    private static boolean checkIfSquareCouldBeInscribedInCircle (double squareDiagonal, double circleRadius){
        return squareDiagonal == 2 * circleRadius;
    }
}
