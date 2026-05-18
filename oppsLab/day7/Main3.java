/*Write a Java class which has a method called ProcessInput(). This
method checks the number entered by the user. If the entered number is negative then
throw an user defined exception called NegativeNumberException, otherwise it displays
the double value of the entered number.*/
import java.util.*;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Main3 {

    
   
    
    public static void main(String[] args) {
    	System.out.println("Enter a number");
    	Scanner sc=new Scanner (System.in);
    	int number=sc.nextInt();
    	try{
    		if (number < 0) {
            
            throw new NegativeNumberException("Negative numbers are not allowed: " + number);
        } else {
            
            System.out.println("Double value: " + (number * 2));
           }
    	}
       
        catch(NegativeNumberException e){
        	System.out.println("Error: "+ e.getMessage());
        }
    }
}