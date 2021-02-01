import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Random;

public class Artist {
    int id;
    String name;
    String city;
    String country;
    LocalDate birthDate;
    ArrayList<Integer> ids;


    // Artist constructor
    public Artist(String name, String city, String country, LocalDate birthDate) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.birthDate = birthDate;
    }

    // returns days till birthday
    public long daysTillBirthday() {
        LocalDate birthday = getBirthDate();
        LocalDate currentDate = LocalDate.now();
        LocalDate nextBDay = birthday.withYear(currentDate.getYear());

        Period p = Period.between(currentDate, nextBDay);
        long p2 = ChronoUnit.DAYS.between(currentDate, nextBDay);
        return  p2;
    }

    // returns artist age
    public int getArtAge() {
        LocalDate birthday = getBirthDate();
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthday, currentDate).getYears();
    }

    // returns string of object's states
    public String printState() {
        String printState = ("Artist id: " + getId() + "\n" + getName() + "\n" + getBirthDate() + "\n" + getCountry() + "\n" + getCity() + "\n" + daysTillBirthday() + " days until birthday.\n" + getArtAge() + " years old." + "\n---\n");
        return printState;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


}
