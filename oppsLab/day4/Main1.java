/*A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D
box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. Implement
it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits
from 2D.*/

class sheet{
	void display(float length, float breadth){
		System.out.println(40*length*breadth);
	}
}

class box extends sheet{
	void display(float length, float breadth, float height){
		System.out.println(60*length*breadth*height);
	}
}

class Main1{
	public static void main(String [] args){
		box a=new box();
		a.display(12,2,4);
		a.display(2,3);
	}
}