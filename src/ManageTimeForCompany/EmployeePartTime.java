package ManageTimeForCompany;

public class EmployeePartTime extends Employee{
    private double numberOfHour;

    public EmployeePartTime() {
    }

    public EmployeePartTime(String id, String name, int age, String numberPhone, String email, Address address, double numberOfHour) {
        super(id, name, age, numberPhone, email, address);
        this.numberOfHour = numberOfHour;
    }

    public double getNumberOfHour() {
        return numberOfHour;
    }

    public void setNumberOfHour(double numberOfHour) {
        this.numberOfHour = numberOfHour;
    }
}
