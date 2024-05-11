// Programmer: Johny (sapopk)
// Date Written: 13/05/2023
// Function: Assignment 03 - SD2_Skills Demo
// Feature: FullTimeEmployee class Inheritance Employee (extends)

//Inheritance Employee (extends)
public class FullTimeEmployee extends Employee {
    private double salary;

    //Constructor
    public FullTimeEmployee(String ppsNumb, String firstName, String lastName, double salary) {
        super(ppsNumb, firstName, lastName); //Inheritance from Employee class
        this.salary = salary;
    }

    //Abstractic method earnings
    @Override
    public double earnings() {return salary;}

    //get & set method (Accessor & Mutator)
    public void setSalary(double salary) {this.salary = salary;}
    public double getSalary() {return salary;}

    //toString with String.format method (Polymorphism)
    //using getFullName method
    //Explanation in Employee class
    @Override
    public String toString() {
        String formatInfo = "| %-10s | %-25s | %18.2f |";

        return 
        String.format(formatInfo, getPPSNumb(), getFullName(), earnings());
    }
}