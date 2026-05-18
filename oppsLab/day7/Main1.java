/*Write a Java program to generate an
ArrayIndexOutofBoundsException and handle it using catch statement.
*/

public class Main1{
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.println("Accessing element at index 10: " + numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Exception caught: " + e);
            System.err.println("You tried to access an index outside the array bounds.");
        }

        System.out.println("Program execution continues after handling the exception.");
    }
}