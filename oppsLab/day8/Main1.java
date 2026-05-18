/*Write a java program which will accept students details like Student
RollNo, Name, Subject, Marks from the keyboard using scanner class, stored the same in
a file. Again open the file, read the content and display all.*/

import java.io.*;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept student details
        System.out.print("Enter Student Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        // File to store student details
        String fileName = "student.txt";

        // Write details to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Roll No: " + rollNo);
            writer.newLine();
            writer.write("Name: " + name);
            writer.newLine();
            writer.write("Subject: " + subject);
            writer.newLine();
            writer.write("Marks: " + marks);
            writer.newLine();
            System.out.println("\nStudent details saved to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read details back from file
        System.out.println("\nReading student details from file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

        sc.close();
    }
}