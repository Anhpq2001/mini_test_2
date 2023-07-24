package ManageTimeForCompany;

import java.util.*;
import java.util.stream.Collectors;

public class ManageV2 {

    private final Map<Long,Employee> employees = new TreeMap<>();
    private final Scanner scanner = new Scanner(System.in);

    public void displayMenu() {

        Employee  employee = new Employee();
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
                // add new emp
                    employees.put(1L,employee);
                    break;
                case 2:
                    employees.replace(1L,employee);
                    break;
                case 3:
                    employees.remove(1L,employee);
                    break;
                case 4:
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:
                    System.exit(0);
            }
        }
    }

    private void addEmploy(Employee employee)  throws Exception {
        System.out.println("Vui lòng nhập thông tin nhân viên: ");

        System.out.println("Tên nhân viên : ");
        employee.setName(scanner.nextLine());

        System.out.println("Tuổi nhân viên : ");
        employee.setAge(scanner.nextInt());

        System.out.println("Số điện thoại nhân viên : ");
        employee.setNumberPhone(scanner.nextLine());

        System.out.println("Email nhân viên : ");
        employee.setEmail(scanner.nextLine());

        System.out.println("Địa chỉ nhân viên (Số nhà(nhập số)/Xã/Tỉnh)");
        List<String> adr = Arrays.stream(scanner.nextLine().split("\\s*/\\s*")).collect(Collectors.toList());

        Employee employee1 = new EmployeeFullTime();

        }
    }


