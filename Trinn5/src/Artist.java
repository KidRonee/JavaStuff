import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Artist {
    String artistName;
    LocalDate dateOfBirth;
    String city;
    String country;
    int id;


    // constructor
    public Artist (String name, LocalDate DOB, String city, String country) {
        this.artistName = name;
        this.dateOfBirth = DOB;
        this.country = country;
        this.city = city;
    }

    public long daysTillBirthday(){
        LocalDate birthday = getDateOfBirth();
        LocalDate currentDate = LocalDate.now();
        LocalDate nextBday = birthday.withYear(currentDate.getYear());

        Period p = Period.between(currentDate, nextBday);
        long p2 = ChronoUnit.DAYS.between(currentDate, nextBday);
        return  p2;
    }

    public int artistAge() {
        LocalDate birthday = getDateOfBirth();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate currentDate = LocalDate.now();
        currentDate.format(formatter);
        return Period.between(birthday, currentDate).getYears();
    }

    public String sOut() {
        String out = ("Artist id: " + getId() + "\n" + getArtistName() + "\n" + getDateOfBirth() + "\n" + getCountry() + "\n" + getCity() + "\n" + daysTillBirthday() + " days until birthday.\n" + artistAge() + " years old." + "\n---\n");
        return out;
    }

    public int generateId() {
        Random id = new Random();
        return id.nextInt(1000);
    }


 // getters and setters
    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
