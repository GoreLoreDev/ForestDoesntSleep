/*Write a program in Java to copy the content of a given file to another
user entered file using character stream (using File Reader and FileWriter Classes) and
byte Stream (using FileInputStream and FileOutputStream Class).*/
import java.io.*;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input file
            System.out.print("Enter source file name: ");
            String sourceFile = sc.nextLine();

            // Output file for character stream
            System.out.print("Enter destination file name (character stream): ");
            String destCharFile = sc.nextLine();

            // Output file for byte stream
            System.out.print("Enter destination file name (byte stream): ");
            String destByteFile = sc.nextLine();

            // Copy using character stream
            copyUsingCharacterStream(sourceFile, destCharFile);

            // Copy using byte stream
            copyUsingByteStream(sourceFile, destByteFile);

            System.out.println("File copied successfully using both methods!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    // Method 1: Character Stream (FileReader & FileWriter)
    public static void copyUsingCharacterStream(String source, String dest) {
        try (FileReader fr = new FileReader(source);
             FileWriter fw = new FileWriter(dest)) {

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            System.out.println("Character stream copy completed.");
        } catch (IOException e) {
            System.out.println("Character stream error: " + e.getMessage());
        }
    }

    // Method 2: Byte Stream (FileInputStream & FileOutputStream)
    public static void copyUsingByteStream(String source, String dest) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            System.out.println("Byte stream copy completed.");
        } catch (IOException e) {
            System.out.println("Byte stream error: " + e.getMessage());
        }
    }
}