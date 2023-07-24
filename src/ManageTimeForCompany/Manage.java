package ManageTimeForCompany;

import java.util.ArrayList;
import java.util.List;

public class Manage {
    static List<Employee> employeeList = new ArrayList<>();


    // function to display menu
    public static void displayMenu() {
        while (true) {
            System.out.println("----------Manage Employee----------");
            System.out.println("1. Add new employee.");
            System.out.println("2. Update employee.");
            System.out.println("3. Remove employee.");
            System.out.println("4. Count salary for employee.");
            System.out.println("5. Count average salary for employee in company.");
            System.out.println("6. Display employee full time have salary less than average salary.");
            System.out.println("7. Count total salary for employee parttime in company.");
            System.out.println("8. Sort employee parttime by salary.");
            System.out.println("9. Exit");
            int choice = Validation.checkInt("Enter your choice:", 0, 10);
            switch (choice) {
                case 1:
                    addEmployee();
                    displayEmployee(employeeList);
                    break;
                case 2:
                    updateEmployee();
                    displayEmployee(employeeList);
                    break;
                case 3:
                    removeEmployee();
                    displayEmployee(employeeList);
                    break;
                case 4:
                    countSalary();
                    break;
                case 5:
                    averageSalaryEmployee();
                    break;
                case 6:
                    employeeHaveSalaryLessThanAverage();
                    break;
                case 7:
                    totalSalaryEmployeePartTime();
                    break;
                case 8:
                    sortBySalary();
                    break;
                case 9:
                    System.exit(0);
            }
        }
    }

    // function to input value
    public static void inputValue() {
        Employee employee = null;
        String value = Validation.checkEmpty("Enter F(full time) or P(part time)");
        String id = Validation.checkId("Enter id employee: ");
        String name = Validation.checkEmpty("Enter name employee: ");
        int age = Validation.checkInt("Enter age employee: ", 18, 50);
        String numberPhone = Validation.checkNumberPhone("Enter phone number employee: ");
        String email = Validation.checkEmail("Enter email employee: ");
        int houseNumber = Validation.checkInt("Enter house number employee: ", 0, Integer.MAX_VALUE);
        String ward = Validation.checkEmpty("Enter ward employee: ");
        String province = Validation.checkEmpty("Enter province employee: ");
        Address address = new Address(houseNumber, ward, province);
        if(value.equalsIgnoreCase("f")){
            double bonus = Validation.checkDouble("Enter bonus for full time employee: ", -1, Double.MAX_VALUE);
            double fine = Validation.checkDouble("Enter fine for full time employee: ", -1, Double.MAX_VALUE);
            double salary = Validation.checkDouble("Enter salary full time employee: ", -1, Double.MAX_VALUE);
            employee = new EmployeeFullTime(id, name, age, numberPhone, email, address, bonus, fine, salary);
        } else if (value.equalsIgnoreCase("p")) {
            double numberOfHour = Validation.checkDouble("Enter hour of part time employee: ", -1, Double.MAX_VALUE);
            employee = new EmployeePartTime(id, name, age, numberPhone, email, address, numberOfHour);
        }
    }

    // function to add employee
    public static void addEmployee() {
        inputValue();
    }

    // function to remove employee
    public static void removeEmployee() {

    }

    // function to update employee
    public static void updateEmployee() {

    }

    // function to count salary for employee
    public static void countSalary() {

    }

    // function to count average salary for employee
    public static void averageSalaryEmployee() {

    }

    // function to display employee have salary less than average salary
    public static void employeeHaveSalaryLessThanAverage() {

    }

    // function count total salary of employee parttime
    public static void totalSalaryEmployeePartTime() {

    }

    // function to sort employee parttime by salary
    public static void sortBySalary() {

    }

    // function to display employee in company
    public static void displayEmployee(List<Employee> list) {
        for (Employee employee : list) {
            System.out.println(employee.toString());
        }
    }
}
