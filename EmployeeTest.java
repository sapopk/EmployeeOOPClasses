// Programmer: Johny (sapopk)
// Date Written: 13/05/2023
// Function: Assignment 03 - SD2_Skills Demo
// Feature: EmployeeTest class to run Full Time & Part Time

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {

        //Variables to help the header of the table to display
        //all Full-Time & Part-Time content.
        String formatRepeatDash = "%n%s%n";
        String formatTitle = "|%47s %14s";
        String formatHeader = "| %-11s| %-26s| %-19s|";

        Scanner scan = new Scanner(System.in);

        //ArrayList for Full-Time (fullEmp) & Part-Time (partEmp) Classes.
        ArrayList<Employee> fullEmp = new ArrayList<>();
        ArrayList<Employee> partEmp = new ArrayList<>();

        // Creation of Object class (f1, f2 & f3) FullTimEmployee with Composition() implemented.
        FullTimeEmployee f1 = new FullTimeEmployee("5804973M", "Mary", "Mars", 38000);
        FullTimeEmployee f2 = new FullTimeEmployee("5804973M", "Antonio", "Nicolas", 120000);
        FullTimeEmployee f3 = new FullTimeEmployee("5804973M", "James", "Mars", 60000);

        // Creation of Object class (p1, p2 & p3) PartTimEmployee with Composition() implemented.
        PartTimeEmployee p1 = new PartTimeEmployee("5470254H", "Harvey", "Cook", 20, 40);
        PartTimeEmployee p2 = new PartTimeEmployee("5470254H", "Carlos", "Smith", 13.40, 80);
        PartTimeEmployee p3 = new PartTimeEmployee("5470254H", "Aline", "Alves", 17.5, 160);

        //Add method from Collection classes to add 
        //Values from Full-Time & Part-Time classes.
        fullEmp.add(f1);
        fullEmp.add(f2);
        fullEmp.add(f3);
        partEmp.add(p1);
        partEmp.add(p2);
        partEmp.add(p3);

        //Collection sort with two element assigned as e1 and e2 and
        //using the lambda expression (->) to compare both element values (e1, e2) 
        //comparing getFirstName() method from Encapsulation class
        Collections.sort(fullEmp, (e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()));
        Collections.sort(partEmp, (e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()));

        //Employee Information Table for Full - Time.
        System.out.printf(formatRepeatDash, "-" .repeat(63));
        System.out.printf(formatTitle, "Full Time - Employee Information", "|");
        System.out.printf(formatRepeatDash, "-" .repeat(63));
        System.out.printf(formatHeader,"PPS Numb", "Full Name", "Annually Salary");
        System.out.printf(formatRepeatDash, "-" .repeat(63));

        //Enhanced for loop with fullEmp ArrayList
        for(Employee ep: fullEmp) {
            System.out.println(ep.toString());
        }
        System.out.print("-" .repeat(63));

        //Employee Information Table for Part - time.
        System.out.printf(formatRepeatDash, "-" .repeat(63));
        System.out.printf(formatTitle, "Part Time - Employee Information", "|");
        System.out.printf(formatRepeatDash, "-" .repeat(63));
        System.out.printf(formatHeader,"PPS Numb", "Full Name", "Weekly Salary");
        System.out.printf(formatRepeatDash, "-" .repeat(63));
        
        //Enhanced for loop with partEmp ArrayList
        for(Employee ep: partEmp) {
            System.out.println(ep.toString());
        }
        System.out.print("-" .repeat(63));

        scan.close(); //close Scanner
    }
}
