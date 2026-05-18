/*-Write a program in java which will display the working of two threads in
synchronization.*/

// class SharedResource {

//     // Synchronized method
//     synchronized void printNumbers(String threadName) {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println(threadName + " is printing: " + i);
            
//         }
//     }
// }

// class MyThread extends Thread {
//     SharedResource resource;

//     // Constructor
//     MyThread(SharedResource resource, String name) {
//         super(name);
//         this.resource = resource;
//     }

//     public void run() {
//         // Calling synchronized method
//         resource.printNumbers(Thread.currentThread().getName());
//     }
// }

// public class Main2 {
//     public static void main(String[] args) {

//         // Shared object
//         SharedResource obj = new SharedResource();

//         // Creating two threads
//         MyThread t1 = new MyThread(obj, "Thread-1");
//         MyThread t2 = new MyThread(obj, "Thread-2");

//         // Starting threads
//         t1.start();
//         t2.start();
//     }
// }

class Display {
    // Static synchronized method
    synchronized static void show() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
            Thread.sleep(1000); // sleep/stop a thread for 1 second
         } catch(InterruptedException e) {
            System.out.println("An Excetion occured: " + e);
         }
        }
        System.out.println();
    }
}

class MyThread extends Thread {
    public void run() {
        Display.show();
    }
}

public class Main2	 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}