package d_Employee_Management_System;


public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        // Add employees
        ems.addEmployee(new Employee(1, "Alice", "Manager", 75000));
        ems.addEmployee(new Employee(2, "Bob", "Developer", 50000));
        ems.addEmployee(new Employee(3, "Charlie", "Designer", 45000));

        // Traverse employees
        System.out.println("All Employees:");
        ems.traverseEmployees();

        // Search for an employee
        Employee employee = ems.searchEmployee(2);
        System.out.println("Search Result: " + (employee != null ? employee : "Employee not found"));

        // Delete an employee
        ems.deleteEmployee(2);
        System.out.println("After Deletion:");
        ems.traverseEmployees();
    }
}
