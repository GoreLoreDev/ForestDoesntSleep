/*Illustrate the execution of constructors in multi-level inheritance with three
Java classes – plate(length, width), box(length, width, height), wood box (length, width, height, thick)
where box inherits from plate and woodbox inherits from box class. Each class has constructor where
dimensions are taken from user.*/

import java.util.Scanner;

class Plate {
    int length, width;

    Plate(int l, int w) {
        length = l;
        width = w;
        System.out.println("Plate constructor executed: length = " + length + ", width = " + width);
    }
}

class Box extends Plate {
    int height;

    Box(int l, int w, int h) {
        super(l, w); 
        height = h;
        System.out.println("Box constructor executed: height = " + height);
    }
}

class WoodBox extends Box {
    int thick;

    WoodBox(int l, int w, int h, int t) {
        super(l, w, h); 
        thick = t;
        System.out.println("WoodBox constructor executed: thickness = " + thick);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter width: ");
        int w = sc.nextInt();
        System.out.print("Enter height: ");
        int h = sc.nextInt();
        System.out.print("Enter thickness: ");
        int t = sc.nextInt();

        WoodBox wb = new WoodBox(l, w, h, t);
    }
}