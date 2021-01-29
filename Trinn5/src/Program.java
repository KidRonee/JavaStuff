import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Program {
    ArrayList<String> names = new ArrayList<>();
    ArrayList<LocalDate> DOBS = new ArrayList<LocalDate>();
    ArrayList<String> cities = new ArrayList<>();
    ArrayList<String> countries = new ArrayList<>();

    ArrayList<String> userStrings = new ArrayList<String>();
    ArrayList<Artist> artistList = new ArrayList<>();
    String testString = "";


    public void oppgave4 () throws FileNotFoundException {
        File file = new File("C:\\Users\\Mathi\\Desktop\\opg4.txt");
        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
            System.out.println(input.nextLine());
        }
        input.close();
    }

    public void oppgave5() throws IOException {
        FileWriter writeTofile = new FileWriter("C:\\Users\\Mathi\\Desktop\\opg5.txt");
        int i = 0;
        while (i <= 4) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Write your message here: ");
            userStrings.add(sc.nextLine());
            try {
                writeTofile.write(userStrings.get(i) + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
            i++;
        }
        writeTofile.close();
    }

    public void oppgave7() throws IOException {
        ArrayList<String> arrList = new ArrayList<>();

        File readFile = new File("C:\\Users\\Mathi\\Desktop\\opg7.txt");
        Scanner file = new Scanner(readFile);
        while (file.hasNextLine()) {
            String name = file.nextLine();
            LocalDate DOB = LocalDate.parse(file.nextLine());
            String city = file.nextLine();
            String country = file.nextLine();
            String ignore = file.nextLine();
            this.names.add(name);
            this.DOBS.add(DOB);
            this.cities.add(city);
            this.countries.add(country);
        }

        System.out.println(names.size());

        /*
        Artist art1 = new Artist(names.get(0), LocalDate.parse(DOBS.get(0)), cities.get(0), countries.get(0));
        Artist art2 = new Artist(names.get(1), LocalDate.parse(DOBS.get(1)), cities.get(1), countries.get(1));
        Artist art3 = new Artist(names.get(2), LocalDate.parse(DOBS.get(2)), cities.get(2), countries.get(2));
        Artist art4 = new Artist(names.get(3), LocalDate.parse(DOBS.get(3)), cities.get(3), countries.get(3));
        Artist art5 = new Artist(names.get(4), LocalDate.parse(DOBS.get(4)), cities.get(4), countries.get(4));
        Artist art7 = new Artist(names.get(6), LocalDate.parse(DOBS.get(6)), cities.get(6), countries.get(6));
        Artist art6 = new Artist(names.get(5), LocalDate.parse(DOBS.get(5)), cities.get(5), countries.get(5));



        art1.setArtistName("Moldevort");
        art7.setCity("Kolbotn");
        art2.setDateOfBirth(LocalDate.parse("6666-12-13"));
        art4.setCountry("your mum");

        FileWriter writeToFile = new FileWriter("C:\\Users\\Mathi\\Desktop\\opg7.txt");
        writeToFile.write(art1.getArtistName());
        writeToFile.close();

         */

    }

}
