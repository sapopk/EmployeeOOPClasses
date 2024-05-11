// Programmer: Johny (sapopk)
// Date Written: 13/05/2023
// Function: Assignment 03 - SD2_Skills Demo
// Feature: PartTimeEmployee class Inheritance Employee (extends)

//Inheritance Employee (extends)
public class PartTimeEmployee extends Employee {
    private double hours;
    private double hourlyPay;

    // Constructor
    public PartTimeEmployee(String ppsNumb, String firstName, String lastName, double hourlyPay, double hours) {
        super(ppsNumb, firstName, lastName); //Inheritance from Employee class

        //Test hourlyPay variable if value is below 0 or above 160
        //IllegalArgumentException test the value entered
        if(hourlyPay < 0) {
            throw new IllegalArgumentException("Hourly pay must be above 0");
        } else {
            this.hourlyPay = hourlyPay;
        }
        
        //Test hours variable if value is below 0 or above 160
        //IllegalArgumentException test the value entered
        if(hours < 0 || hours > 160) {
            throw new IllegalArgumentException("Hours must be between 0 & 160");
        } else {
            this.hours = hours;
        }
    }

    //get method(Accessor)
    public double getHours() {return hours;}
    public double getHourlyPay() {return hourlyPay;}

    //set method(Mutator)
    public void setHours(double hours) {
        if(hours < 0 || hours > 160) {
            throw new IllegalArgumentException("Hours must be between 0 & 160");
        } else {
            this.hours = hours;
        }
    }

    //set method(Mutator)
    public void setHourlyPay(double hourlyPay) {
        if(hourlyPay < 0) {
            throw new IllegalArgumentException("Hourly pay must be above 0");
        } else {
            this.hourlyPay = hourlyPay;
        }
    }

    //Abstractic method earnings
    @Override
    public double earnings() {
        if(hours <= 40) {
            return hours * hourlyPay;
        } else {
            return 40 * getHourlyPay() + ( getHours() - 40 ) * getHourlyPay() * 1.5;
        }
    }

    //toString with String.format method (Polymorphism)
    //using getFullName method
    //Explanation in Employee class
    public String toString() {
        String formatInfo = "| %-10s | %-25s | %18.2f |";

        return
        String.format(formatInfo, getPPSNumb(), getFullName(), earnings());
    }
}
