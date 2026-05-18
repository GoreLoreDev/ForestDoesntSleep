/*-Write a java program that displays the number of characters, no. of
lines and no. of words present in a text file whose name is given by the user.*/

import java.io.*;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the filename: ");
        String filename = sc.nextLine();
        
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                
                // Split by whitespace to count words
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }
            
            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);
            
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        
        sc.close();
    }
}