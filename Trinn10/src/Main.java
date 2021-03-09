public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        Program program = new Program();
        program.makeTwoPersonObjects();
        program.addPerson(new Person(23, "mathias"));
        program.addPerson(new Person(22, "philip"));
        program.addPerson(new Person(22, "sander"));
        program.addPerson(new Person(23, "henrik"));
        program.addPerson(new Person(22, "joakim"));
        program.addPerson(new Person(22, "syver"));
        program.addPerson(new Person(22, "philip"));
        program.addPerson(new Person(22, "marcus"));
        program.addPerson(new Person(54, "annika"));
        program.addPerson(new Person(55, "christian"));
        //System.out.println(program.getSamplePerson("mathias"));
        program.getPersonByAge(23);
    }
}
