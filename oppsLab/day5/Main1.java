/*
-Illustrate the usage of abstract class with following Java classes –
 An abstract class ‘student’ with two data members roll no, reg no, a method getinput() and an abstract
method course()
 A subclass ‘kiitian’ with course() method implementation
Write the driver class to print the all details of a kiitian object.

Input - Rollno - 2205180

Registration no - 1234567890

Output -Rollno - 2205180

Registration no - 1234567890
Course - B.Tech. (Computer Science &amp; Engg)
*/

import java.util.Scanner;


abstract class student {
    int rollno;
    long regno;

    void getinput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rollno - ");
        rollno = sc.nextInt();
        System.out.print("Registration no - ");
        regno = sc.nextLong();
    }

    abstract void course();
}


class kiitian extends student {

    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    void display() {
        System.out.println("Rollno - " + rollno);
        System.out.println("Registration no - " + regno);
        course();
    }
}

 
class Main {
    public static void main(String[] args) {
        kiitian k = new kiitian();
        k.getinput();
        k.display();
    }
}
