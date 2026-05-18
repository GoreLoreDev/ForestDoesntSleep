/*Write a program to create user defined exceptions called
HrsException, MinException and SecException. Create a class Time which contains data
members hours, minutes, seconds and a method to take a time from user which throws
the user defined exceptions if hours (&gt;24 &amp;&lt;0),minutes(&gt;60 &amp;&lt;0),seconds(&gt;60 &amp;&lt;0).*/

import java.util.*;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Main4 {
    public static void main(String args[]) {
        try {
            int hrs, mins, secs;
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter hrs mins secs:");
            hrs = sc.nextInt();
            mins = sc.nextInt();
            secs = sc.nextInt();

            if (hrs < 0 || hrs > 23) {
                throw new HrsException("Hours is wrong: " + hrs);
            }

            if (mins < 0 || mins > 59) {
                throw new MinException("Minutes is wrong: " + mins);
            }

            if (secs < 0 || secs > 59) {
                throw new SecException("Seconds is wrong: " + secs);
            }

            System.out.println("The time is correct");
        } 
        catch (HrsException e1) {
            System.out.println("Error: " + e1.getMessage());
        } 
        catch (MinException e2) {
            System.out.println("Error: " + e2.getMessage());
        } 
        catch (SecException e3) {
            System.out.println("Error: " + e3.getMessage());
        }
    }
}
