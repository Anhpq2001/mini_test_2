package ManageTimeForCompany;

public class EmployeeFullTime extends Employee{
    private double bonus;
    private double fine;
    private double salary;

    public EmployeeFullTime() {
    }

    public EmployeeFullTime(String id, String name, int age, String numberPhone, String email, Address address, double bonus, double fine, double salary) {
        super(id, name, age, numberPhone, email, address);
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
