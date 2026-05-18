class Counter {
    // static variable shared by all objects
    static int count = 0;

    // constructor increments count whenever an object is created
    Counter() {
        count++;
    }

    // static method to return count
    static int getCount() {
        return count;
    }
}

public class Demo{
    public static void main(String[] args) {

        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        System.out.println("Number of objects created: " + Counter.getCount());
    }
}
