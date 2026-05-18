/*-Define an interface with three methods – earnings(), deductions() and bonus()
and define a Java class ‘Manager’ which uses this interface without implementing bonus() method.
Also define another Java class ‘Substaff’ which extends from ‘Manager’ class and implements
bonus() method. Write the complete program to find out earnings, deduction and bonus of a
sbstaff with basic salary amount entered by the user as per the following guidelines –
earnings basic + DA (80% of basic) + HRA (15% of basic)
deduction PF 12% of basic
bonus 50% of basic
Input -Basic salary - 50000
Output -Earnings - 97500
Deduction -6000
Bonus - 25000
*/

import java.util.Scanner;

interface Salary {
    void earnings();
    void deductions();
    void bonus();
}


abstract class Manager implements Salary {
    double basic;

    Manager(double basic) {
        this.basic = basic;
    }

    public void earnings() {
        double da = 0.80 * basic;
        double hra = 0.15 * basic;
        double totalEarnings = basic + da + hra;
        System.out.println("Earnings - " + (int) totalEarnings);
    }

    public void deductions() {
        double pf = 0.12 * basic;
        System.out.println("Deduction - " + (int) pf);
    }
}


class Substaff extends Manager {

    Substaff(double basic) {
        super(basic);
    }

    public void bonus() {
        double bonus = 0.50 * basic;
        System.out.println("Bonus - " + (int) bonus);
    }
}


class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Basic salary - ");
        double basic = sc.nextDouble();

        Substaff s = new Substaff(basic);
        s.earnings();
        s.deductions();
        s.bonus();
    }
}
// university wants to design an evaluation system with a different evaluation types such as mid exms, quizes, projects, internships and must follow a common evaluation standard but use different evaluation logic. 
//which type of design is appropriate for this system
// design an interface evaluation with a method calculate score
// implement the interface in the above mentioned classes
// demonstrate run time polymorphism using interface reference
// q 2>an interface reference is assigned to an object of a class that implements it, explain why this is allowed and what type of method binding occurs in this case
// q3> consider a system where multiple unrelated classes must follow the same contract justify why interface is more suitable than an abstract class in this scenario