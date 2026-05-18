import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException{

        titleScreen();

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        
        intro(name);
    }
    public static void titleScreen() throws InterruptedException {

        System.out.println("""
████████╗██╗  ██╗███████╗
╚══██╔══╝██║  ██║██╔════╝
   ██║   ███████║█████╗
   ██║   ██╔══██║██╔══╝
   ██║   ██║  ██║███████╗
   ╚═╝   ╚═╝  ╚═╝╚══════╝

███████╗ ██████╗ ██████╗ ███████╗███████╗████████╗
██╔════╝██╔═══██╗██╔══██╗██╔════╝██╔════╝╚══██╔══╝
█████╗  ██║   ██║██████╔╝█████╗  ███████╗   ██║
██╔══╝  ██║   ██║██╔══██╗██╔══╝  ╚════██║   ██║
██║     ╚██████╔╝██║  ██║███████╗███████║   ██║
╚═╝      ╚═════╝ ╚═╝  ╚═╝╚══════╝╚══════╝   ╚═╝
""");

        Thread.sleep(1000);

        typeText("The forest doesn't sleep...\n");
        Thread.sleep(1500);

        System.out.println();
    }
    public static void typeText(String text) throws InterruptedException {

        for (int i = 0; i < text.length(); i++) {

            System.out.print(text.charAt(i));

            Thread.sleep(40);
        }
    }

    public static void intro(String name)throws InterruptedException{

        System.out.println();
        System.out.println(name + ", you wake up in a frozen forest.");
        System.out.println("Snow falls silently.");

        Thread.sleep(1000);

        System.out.println("Somewhere behind you...");

        Thread.sleep(1000);

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

    public static void cabin() throws InterruptedException{

        System.out.println();
        System.out.println("The cabin door creaks open.");
        System.out.println("Inside, a lantern flickers.");
        System.out.println();

        Thread.sleep(1000);
        
        System.out.println("1. Take the lantern");
        System.out.println("2. Go upstairs");

        int choice = input.nextInt();

        if (choice == 1) {
            goodEnding();
        } else {
            badEnding();
        }
    }

    public static void forest() throws InterruptedException{

        System.out.println();
        System.out.println("You run through the trees.");

        Thread.sleep(1000);

        System.out.println("Footsteps follow behind you.");

        Thread.sleep(1000);

        System.out.println("Closer.");

        Thread.sleep(1000);

        System.out.println("Closer.");

        Thread.sleep(1000);

        badEnding();
    }

    public static void goodEnding() throws InterruptedException{

        System.out.println();
        System.out.println("The lantern reveals hidden symbols on the wall.");

        Thread.sleep(1000);

        System.out.println("A secret exit opens behind the cabin.");
        System.out.println();
        typeText("YOU SURVIVED.");
    }

    public static void badEnding() throws InterruptedException{

        System.out.println();
        System.out.println("A pale figure emerges from the darkness.");

        Thread.sleep(1000);

        System.out.println("Its eyes are completely white.");

        Thread.sleep(1000);

        System.out.println();
        typeText("It grips your throat and the forest falls silent.");
    }
}