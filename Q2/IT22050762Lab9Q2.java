
import java.util.Scanner;

public class IT22050762Lab9Q2 {

    // Method to calculate the area of a circle
    public static double circleArea(double radius) {

        double area = Math.PI * radius * radius;

        return area;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double radius = input.nextDouble();

        // Call the circleArea method
        double area = circleArea(radius);

        System.out.println("Area of the circle: " + area);

        input.close();
    }
}
