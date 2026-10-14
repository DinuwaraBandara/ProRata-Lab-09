
public class IT22050762Lab9Q3 {

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to square an integer
    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        // Expression 1: (3 * 4 + 5 * 7)^2
        int result1 = square(
            add(multiply(3, 4), multiply(5, 7))
        );

        // Expression 2: (4 + 7)^2 + (8 + 3)^2
        int result2 = add(
            square(add(4, 7)),
            square(add(8, 3))
        );

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
