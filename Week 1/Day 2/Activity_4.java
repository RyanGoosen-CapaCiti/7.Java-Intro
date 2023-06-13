/* 
Using TextEdit or Notepad create an Employee class with four instance variables - name, age, designation and salary, (choose appropriate data types for these instance variables).

Your class should have one explicitly defined constructor, which takes a single parameter for the variable name.

In your class include printEmployee() method which print employee instance  variables. 

Also create a main method for your class.  In the main method you should create 3 employee object using Employee class and use the printEmployee() to print the employee details.
*/

public class Activity_4 {
    // Variable declarations
    private String name;
    private int age;
    private String designation;
    private int salary;
    // Constructor, same like in python (initializing)
    // Naming conventions need to be the same as 
    public Activity_4(String name, int age, String designation, int salary){
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    public void printEmployee() {
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Designation: "+ designation);
        System.out.println("Salary: "+ salary);
    }

    public static void main(String[] args) {
        Activity_4 employee1 = new Activity_4("Jameson", 20, "Software crew", 6000);
        employee1.printEmployee();

        Activity_4 employee2 = new Activity_4("Jamal", 25, "Junior Dev", 15000);
        employee2.printEmployee();

        Activity_4 employee3 = new Activity_4("Jackson", 35, "Senior Dev", 60000);
        employee3.printEmployee();
    }
}
