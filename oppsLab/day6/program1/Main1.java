
import Marketing.sales;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the employee id and employee name: ");
        int id = sc.nextInt();
        String name = sc.next();

        System.out.print("Enter the basic salary: ");
        double basic = sc.nextDouble();

        
        Sales s = new Sales(id, name, basic);

        
        double totalEarnings = s.earnings();
        double travellingAllowance = s.tallowance();
        double grandTotal = totalEarnings + travellingAllowance;

        
        System.out.println("The emp id of the employee is " + s.getEmpid());
        System.out.println("The total earning is " + totalEarnings);
        System.out.println("Travelling allowance is " + travellingAllowance);
        System.out.println("Grand total earning is " + grandTotal);
    }
}