import java.util.Scanner;

public class StringDemo {
    public static void main(String args[]) {

        // Command line argument
        String str1 = args[0];   // "Welcome"

        // Scanner input
        Scanner sc = new Scanner(System.in);
        String str2 = sc.nextLine();   // "Back to India"

        // Concatenate
        String result = str1 + " " + str2;
        System.out.println("Concatenated String: " + result);

        // Split into 4 parts
        String parts[] = result.split(" ");

        // Store in different string objects
        String s1 = parts[0];
        String s2 = parts[1];
        String s3 = parts[2];
        String s4 = parts[3];

        // Display all 4 strings
        System.out.println("Split Strings:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        sc.close();
    }
}