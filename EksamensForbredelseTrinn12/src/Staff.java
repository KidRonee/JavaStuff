public class Staff extends Person implements Payable {
    private double salary;

    public Staff() {

    }

    public Staff(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Staff(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public Staff(String firstName, String lastName, int age, Address address) {
        super(firstName, lastName, age);

    }

    public Staff(String firstName, String lastName, int age, double salary,Address address) {
        super(firstName, lastName, age, address);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Student: %s, %s, %s, %s", getFirstName(), getLastName(), getAge(), getSalary());
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPayment() {
        return salary*12;
    }
}
