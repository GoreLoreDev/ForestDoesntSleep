import java.util.Scanner;
public class ReverseName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String first = sc.nextLine();
        System.out.print("Enter your last name: ");
        String last = sc.nextLine();
        System.out.println("Full Name: " + last + " " + first);
        sc.close();
    }
}