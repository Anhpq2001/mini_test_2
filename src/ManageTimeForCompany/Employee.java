package ManageTimeForCompany;

public class Employee {
    private String id;
    private String name;
    private int age;
    private String numberPhone;
    private String email;
    private Address address;

    public Employee() {
    }

    public Employee(String id, String name, int age, String numberPhone, String email, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.numberPhone = numberPhone;
        this.email = email;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
