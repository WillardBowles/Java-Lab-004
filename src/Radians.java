/**
 *
 * @author Trevor Hartman
 * @author Willard Bowles
 *
 * @since Version 1.0
 *
 */


import java.util.Scanner;

public class Radians {

    public static double toRadians(double degrees) {
        // Calculate the conversion from degrees to radians
        return degrees * Math.PI / 180.0;
    }

    public static double toDegrees(double radians) {
        // Calculate the conversion from radians to degrees
        return radians * 180.0 / Math.PI;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());

        double radians = toRadians(degrees);
        double mathRadians = Math.toRadians(degrees);
        System.out.printf("Your conversion to radians: %f\n", radians);
        System.out.printf("Math.toRadians conversion: %f\n", mathRadians);

        System.out.print("Type radians you'd like converted to degrees: ");
        radians = Double.valueOf(scanner.nextLine());

        degrees = toDegrees(radians);
        double mathDegrees = Math.toDegrees(radians);
        System.out.printf("Your conversion to degrees: %f\n", degrees);
        System.out.printf("Math.toDegrees conversion: %f\n", mathDegrees);
    }
}