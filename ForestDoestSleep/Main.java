import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=== THE FOREST DOESN'T SLEEP ===");
        System.out.println();

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        intro(name);
    }

    public static void intro(String name) {

        System.out.println();
        System.out.println(name + ", you wake up in a frozen forest.");
        System.out.println("Snow falls silently.");
        System.out.println("Somewhere behind you...");
        System.out.println("Something moves.");
        System.out.println();

        System.out.println("1. Enter the cabin");
        System.out.println("2. Run into the forest");

        int choice = input.nextInt();

        if (choice == 1) {
            cabin();
        } else {
            forest();
        }
    }

    public static void cabin() {

        System.out.println();
        System.out.println("The cabin door creaks open.");
        System.out.println("Inside, a lantern flickers.");

        System.out.println();
        System.out.println("1. Take the lantern");
        System.out.println("2. Go upstairs");

        int choice = input.nextInt();

        if (choice == 1) {
            goodEnding();
        } else {
            badEnding();
        }
    }

    public static void forest() {

        System.out.println();
        System.out.println("You run through the trees.");
        System.out.println("Footsteps follow behind you.");
        System.out.println("Closer.");
        System.out.println("Closer.");

        badEnding();
    }

    public static void goodEnding() {

        System.out.println();
        System.out.println("The lantern reveals hidden symbols on the wall.");
        System.out.println("A secret exit opens behind the cabin.");
        System.out.println();
        System.out.println("YOU SURVIVED.");
    }

    public static void badEnding() {

        System.out.println();
        System.out.println("A pale figure emerges from the darkness.");
        System.out.println("Its eyes are completely white.");
        System.out.println();
        System.out.println("YOU DIED.");
    }
}