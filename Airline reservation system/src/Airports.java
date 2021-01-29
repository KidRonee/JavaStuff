import java.util.Scanner;
import java.util.ArrayList;

public class Airports {
    ArrayList<String> countries = new ArrayList<String>();
    ArrayList<String> cities = new ArrayList<String>();
    ArrayList<String> airports = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);

    public Airports () {

    }

    public ArrayList addCountry() {
        countries.add(this.sc.nextLine());
        return countries;
    }

    public  ArrayList addCity() {
        cities.add(this.sc.nextLine());
        return cities;
    }

    public ArrayList addAirport() {
        airports.add(this.sc.nextLine());
        return airports;
    }
}
