import java.util.Scanner;

public class Main {

    static boolean firstTimeinSpawn=true;
    static boolean firstTimeinCabin=true;
    static boolean firstTimeinChurch=true;
    static boolean firstTimeinLake=true;
    static boolean hasLantern=false;
    public static String location="spawn";

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException{

        titleScreen();

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        
        intro(name);
    }
    public static String name1= name;
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
    public static void showCabin() throws InterruptedException{
        System.out.println("""
      /\
     /  \
    /____\
   | [] []|
   |______|
        """);
        System.out.println("A small cabin stands in the clearing.");

        Thread.sleep(2000);

        System.out.println("It looks abandoned, but a faint light flickers inside.");

        Thread.sleep(2000);

        System.out.println("You enter the cabin to feel the warmth of the lantern light.");

        System.out.println();
        System.out.println("The cabin door creaks open.");
        System.out.println("Inside, a lantern flickers.");
        System.out.println();
    }

    public static void showChurch() throws InterruptedException {
        System.out.println("""                 
                 ^
                / \
               /___\
              |  +  |
              |     |
          ____|_____|____
         /               \
        /_________________\
        ||   _     _    ||
        ||  | |   | |   ||
        ||  |_|   |_|   ||
        ||      ___     ||
        ||     |   |    ||
        ||_____|___|____||
       /___________________\  """);
       
        System.out.println("A small church stands in the clearing.");

        Thread.sleep(2000);

        System.out.println("Its doors are closed, so you push them open to find a dimly lit interior.");

        Thread.sleep(2000);

        typeText("You approach the church to feel close to god in this dark place.");
    }
    public static void showLake() throws InterruptedException{
        System.out.println("""
         ~~~~~~~
         ~~~~~~~
         ~~~~~~~
         ~~~~~~~""");
        System.out.println("A frozen lake lies in the clearing.");

        Thread.sleep(2000);

        System.out.println("The ice is thin, but something glimmers beneath the surface.");

        Thread.sleep(2000);

        
    }
    
        
            

    public static void typeText(String text) throws InterruptedException {

        for (int i = 0; i < text.length(); i++) {

            System.out.print(text.charAt(i));

            Thread.sleep(80);
        }
    }

    public static void intro(String name)throws InterruptedException{

        if (firstTimeinSpawn) {
             System.out.println();
        System.out.println(name + ", you wake up in a frozen forest.");
        typeText("Snow falls silently.");

        Thread.sleep(1000);

        System.out.println("Somewhere behind you...");

        Thread.sleep(1000);

        System.out.println("Something moves.");
        System.out.println();
        firstTimeinSpawn=false;
        }

        System.out.println("Where do you go?");

        System.out.println("the cabin or the forest or north or east?");
        

        String choice = input.nextLine();

        if (choice.equals("the cabin")||choice.equals("cabin")) {
            cabin();
        } else if (choice.equals("forest")||choice.equals("the forest")) {
            forest();
        } else if (choice.equals("north")) {
            church();
        } else if (choice.equals("east")) {
            lake();
        } else {
            System.out.println("Invalid choice. Please try again.");
            intro(name);
        }
    }

    public static void church() throws InterruptedException{
        if (firstTimeinChurch) {
            showChurch();
            firstTimeinChurch=false;
        }

        typeText("The church doors slam shut behind you.");

        Thread.sleep(1000);
        System.out.println("What to do?");

         System.out.println("go outside?"); //will add look around option later

        String choice = input.nextLine();

        if (choice.equals("go outside") || choice.equals("outside")) {
            intro(name1);
        }
    }

    public static void cabin() throws InterruptedException{
        if (firstTimeinCabin) {
            showCabin();
            firstTimeinCabin=false;
        }

        System.out.println("The cabin door flicks open");

        Thread.sleep(1000);
        System.out.println("What to do?");

        if(hasLantern==false){
            System.out.println("take the lantern or go outside?");
        }

        String choice = input.nextLine();

        if (choice.equals("take the lantern") || choice.equals("lantern")) {
            hasLantern = true;
            goodEnding();
        } else {
            intro(name1);
        }
    }

    public static void lake() throws InterruptedException{
        if (firstTimeinLake) {
            showLake();
            firstTimeinLake=false;
        }
        System.out.println("What to do?");

        System.out.println("go back?");//will add look around option later
        String choice = input.nextLine();
        if (choice.equals("go back") || choice.equals("back")) {
            intro(name1);
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