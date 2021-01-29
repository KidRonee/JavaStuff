import java.time.LocalDate;

public class Artist {
    String artistName;
    LocalDate dateOfBirth;
    String city;
    String country;


    // constructor
    public Artist (String name, LocalDate DOB, String city, String country) {
        this.artistName = name;
        this.dateOfBirth = DOB;
        this.country = country;
        this.city = city;
    }

    public String sOut() {
        String out = ("Artist name: " + getArtistName() + "\nDate of birth: " + getDateOfBirth() + "\nNative country: " + getCountry() + "\nNative city: " + getCity());
        return out;
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
}
