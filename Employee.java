// Programmer: Johny (sapopk)
// Date Written: 13/05/2023
// Function: Assignment 03 - SD2_Skills Demo
// Feature: Encapsulation class Employee (Abstract)

public abstract class Employee {
    private String ppsNumb;
    private String firstName;
    private String lastName;

    //Constructor
    public Employee(String ppsNumb, String firstName, String lastName) {
        this.ppsNumb = ppsNumb;
        this.firstName = firstName;
        this. lastName = lastName;
    }

    //Abstract earning: double
    public abstract double earnings();

    //get method (Accessor)
    public String getPPSNumb() {return ppsNumb;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}

    //additional method to return full name
    //this to allow the disply method String.Format to display
    //the employee's full name without breaking the table format
    //in this scenario getFirtName & getLastName method were used, however
    //it can return the private variable firstName & lastName as well.
    public String getFullName() {return getFirstName() +" " +getLastName();}

    //toString with String.format method
    @Override   
    public String toString() {
        String format = "%s %s %s %.2f";
        return String.format(format, ppsNumb, firstName, lastName, earnings());
    }
}