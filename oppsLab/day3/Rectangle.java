import java.util.Scanner;
class Rectangle{

	int length;
	int breadth;
	int area;
	int peremeter;
	void read(){
		Scanner sc=new Scanner (System.in);
		length=sc.nextInt();
		breadth=sc.nextInt();
	}
	void calculate(){
		area=length*breadth;
		peremeter=2*(length+breadth);
	}
	void display(){
		System.out.println("Area= "+area);
		System.out.println("Peremeter= "+peremeter);
	}
	public static void main(String args[]){
		Rectangle r1=new Rectangle();
		r1.read();
		r1.calculate();
		r1.display();
	}
}
