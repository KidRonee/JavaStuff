public class Student extends Person {

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public Student(String firstName, String lastName, int age, Address address) {
        super(firstName, lastName, age, address);
    }

    @Override
    public String toString() {
        return String.format("Student: %s, %s, %s", getFirstName(), getLastName(), getAge());

    }
}
