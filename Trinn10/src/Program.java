import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program {
    HashSet<Person> persons = new HashSet<Person>();


    public void makeTwoPersonObjects() {
        Person person1 = new Person(22, "Mathias");
        Person person2 = new Person(22, "Mathias");
        persons.add(person1);
        persons.add(person2);

        System.out.println(Stream.of(persons.toString()).collect(Collectors.toList()));
    }

    public String getSamplePerson(String name) {
        if (name == null) {
            return "Name can not be set to null!";
        }
        for (Person person : persons
             ) {
            if (name.equals(person.getName()))
                return person.toString();


        }
        return "No person in this hashset has this name";
    }

    public String addPerson(Person p) {
        if ( p == null || p.getName() == null) {
            return "No null values allowed!";
        }
        if (p.getAge() < 0) {
            return "Age can't be negative!";
        }
        persons.add(p);
        return "Added " + p.getName() + " to hashset!";
    }

    public void getPersonByAge(int age) {
        ArrayList<Person> tempArr = new ArrayList<Person>();
        for (Person p: persons
             ) {
            if (p.getAge() > age) {
                tempArr.add(p);
            }
        }
        System.out.println("Found " + tempArr.size() + " people matching the age you entered!");
        for (Person p: tempArr
             ) {
            System.out.println(p.toString());
        }
    }
}
