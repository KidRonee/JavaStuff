public class TestPerson {
    public static void main(String[] args) {
        Address a1 = new Address("Colbjørnsensgate 13b", "0256", "Norway");
        Person staff = new Staff("Mathias", "Brevik", 23, 70000, a1);
        Person student = new Student("Daniel", "Brevik", 19, null);
        System.out.println(staff.toString());
        System.out.println("------------------");
        System.out.println(student.toString());
        System.out.println("------------------");
        System.out.println(((Staff) staff).getPayment());
        ((Staff) staff).setSalary(1000000);
        System.out.println("-----------------");
        System.out.println(((Staff) staff).getSalary());
        System.out.println("------------");
        System.out.println(staff.address.toString());
    }
}
