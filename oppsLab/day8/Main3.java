/*-Write a java program to compare two binary files, printing the first
byte position where they differ.*/
import java.io.FileInputStream;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java CompareBinaryFiles <file1> <file2>");
            return;
        }

        String file1 = args[0];
        String file2 = args[1];

        try (FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2)) {

            int byte1, byte2;
            int position = 0;

            while (true) {
                byte1 = fis1.read();
                byte2 = fis2.read();

                // If both files reached EOF simultaneously
                if (byte1 == -1 && byte2 == -1) {
                    System.out.println("Files are identical.");
                    break;
                }

                // If one file ends before the other OR bytes differ
                if (byte1 != byte2) {
                    System.out.println("Files differ at byte position: " + position);
                    break;
                }

                position++;
            }

        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }
}