import java.util.*;
class Student{
	long rollNum;
	String name;
	float cgpa;
	void LowestCG(int[] arr){
		int index=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]>arr[index]){
				index=i;
			}
		}
		System.out.println("Lowest CG= "arr[index].name);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students");
		int number=sc.nextInt();
		int[] arr=new int[number];
		for(int i=0; i<number; i++){
			Student arr[i]=new Student();
			System.out.println("Enter roll number");
			arr[i].rollNum=sc.nextLong();
			System.out.println("Enter name");
			arr[i].name=sc.nextLine();
			System.out.println("Enter CGPA");
			arr[i].cgpa=sc.nextFloat();
		}
	}
}