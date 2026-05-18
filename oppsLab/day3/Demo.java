class Box{
	int length;
	int width;
	int height;
	void volume(){
		System.out.println(length*height*width);
	}
}
class Demo{
	public static void main(String args[]){
		Box b1=new Box();
		b1.length=10;
		b1.width=20;
		b1.height=30;
		b1.volume();
	}
}