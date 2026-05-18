/*Write a program in Java using multi-threading which will display a counter
value within a specified range with a gap of 5 milliseconds after setting it’s name as given by the
user.*/

import java.util.Scanner;

class CounterThread extends Thread {
    private int start;
    private int end;

    // Constructor to initialize range and thread name
    CounterThread(String name, int start, int end) {
        super(name); // Setting thread name
        this.start = start;
        this.end = end;
    }

    public void run() {
        try {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
            for (int i = start; i <= end; i++) {
                System.out.println("Counter: " + i);
                Thread.sleep(5); // 5 milliseconds gap
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter thread name: ");
        String name = sc.nextLine();

        System.out.print("Enter starting value: ");
        int start = sc.nextInt();

        System.out.print("Enter ending value: ");
        int end = sc.nextInt();

        // Creating thread with user-defined name and range
        CounterThread t1 = new CounterThread(name, start, end);

        // Starting the thread
        t1.start();

        sc.close();
    }
}