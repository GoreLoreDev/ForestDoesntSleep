/*Write a Java program to handle an ArithmeticException using try,
catch, and finally block.*/
public class Main2{
	public static void main(String[] args){
		int a=10;
		int b=0;
		try {
		System.out.println(a/b);
		}
		catch(ArithmeticException e){
			System.out.println("Exception Caught"+ e);
			System.out.println("Arithmatic Exception");
		}
		finally{
			System.out.println("This code always executes");
		}
	}
}