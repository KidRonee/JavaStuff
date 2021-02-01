import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    ArrayList<String> names = new ArrayList<>();
    ArrayList<LocalDate> DOBS = new ArrayList<>();
    ArrayList<String> cities = new ArrayList<>();
    ArrayList<String> countries = new ArrayList<>();
    ArrayList<String> userStrings = new ArrayList<>();
    ArrayList<Integer> ids = new ArrayList<>();
    ArrayList<Artist> artists = new ArrayList<>();


    public void oppgave4 () throws FileNotFoundException {
        File file = new File("C:\\Users\\Mathi\\Desktop\\opg7.txt");
        Scanner input = new Scanner(file);
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\Mathi\\Desktop\\opg8.txt"));

            while (input.hasNextLine()) {
                bw.write(input.nextLine() + "\n");
            }
            input.close();
            bw.close();
        } catch (Exception ex) {
            System.out.println("ERROR!");
        }

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

        Artist art1 = new Artist(names.get(0), (DOBS.get(0)), cities.get(0), countries.get(0));
        Artist art2 = new Artist(names.get(1), (DOBS.get(1)), cities.get(1), countries.get(1));
        Artist art3 = new Artist(names.get(2), (DOBS.get(2)), cities.get(2), countries.get(2));
        Artist art4 = new Artist(names.get(3), (DOBS.get(3)), cities.get(3), countries.get(3));
        Artist art5 = new Artist(names.get(4), (DOBS.get(4)), cities.get(4), countries.get(4));
        Artist art6 = new Artist(names.get(5), (DOBS.get(5)), cities.get(5), countries.get(5));
        Artist art7 = new Artist(names.get(6), (DOBS.get(6)), cities.get(6), countries.get(6));

        System.out.print(
                art1.sOut() +
                art2.sOut() +
                art3.sOut() +
                art4.sOut() +
                art5.sOut() +
                art6.sOut() +
                art7.sOut()
        );
    }

    public void oppgave8() throws IOException {
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
        file.close();

        Artist art1 = new Artist(names.get(0), (DOBS.get(0)), cities.get(0), countries.get(0));
        Artist art2 = new Artist(names.get(1), (DOBS.get(1)), cities.get(1), countries.get(1));
        Artist art3 = new Artist(names.get(2), (DOBS.get(2)), cities.get(2), countries.get(2));
        Artist art4 = new Artist(names.get(3), (DOBS.get(3)), cities.get(3), countries.get(3));
        Artist art5 = new Artist(names.get(4), (DOBS.get(4)), cities.get(4), countries.get(4));
        Artist art6 = new Artist(names.get(5), (DOBS.get(5)), cities.get(5), countries.get(5));
        Artist art7 = new Artist(names.get(6), (DOBS.get(6)), cities.get(6), countries.get(6));

        art1.setArtistName("Moldevort");
        art2.setCountry("Orc Land");
        art6.setCity("Rack City Bitch, rackrack city bitch!");
        art4.setDateOfBirth(LocalDate.of(6666, 6, 9));

        artists.add(art1);
        artists.add(art2);
        artists.add(art3);
        artists.add(art4);
        artists.add(art5);
        artists.add(art6);
        artists.add(art7);

        art1.setId(123);
        art2.setId(323);
        art3.setId(223);
        art4.setId(1123);
        art5.setId(1233);
        art6.setId(198);
        art7.setId(999);

        BufferedWriter bw = new BufferedWriter(
                new FileWriter("C:\\Users\\Mathi\\Desktop\\opg8.txt"));
        try (BufferedWriter bufferedWriter = bw) {
            bw.write(art1.generateId() + "\n" + art1.sOut());
            bw.write(art2.generateId() + "\n" + art2.sOut());
            bw.write(art3.generateId() + "\n" + art3.sOut());
            bw.write(art4.generateId() + "\n" + art4.sOut());
            bw.write(art5.generateId() + "\n" + art5.sOut());
            bw.write(art6.generateId() + "\n" + art6.sOut());
            bw.write(art7.generateId() + "\n" + art7.sOut());
        } catch (Exception ex) {
            return;
        }
        bw.close();

        ids.add(art1.getId());
        ids.add(art2.getId());
        ids.add(art3.getId());
        ids.add(art4.getId());
        ids.add(art5.getId());
        ids.add(art6.getId());
        ids.add(art7.getId());
    }

    public void ekstraOppgave() throws IOException {
        Program test = new Program();
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        while (quit != true) {
            test.menu();
            switch (sc.nextInt()) {
                case 1:
                    int i = 0;
                    while (i < artists.size()) {
                        System.out.println(artists.get(i).sOut());
                        i++;
                    }
                    break;
                case 2:
                    System.out.print("Please type an artist id: ");
                    i = 0;
                    while (i < ids.size()) {
                        if (sc.nextInt() == artists.get(i).getId()) {
                            System.out.println(artists.get(i).sOut());
                            break;
                        } else {
                            i++;
                        }
                        System.out.println("Couldn't find any artist with that id...");
                    }
                    break;
                case 3:
                    System.out.print("Enter an id for your artist: \n>");
                    ids.add(sc.nextInt());
                    System.out.print("Enter a name for your artist: \n>");
                    sc.nextLine(); // controlling line feed
                    names.add(sc.nextLine());
                    System.out.print("Enter a birth date for your artist (yyyy-mm-dd): \n>");
                    DOBS.add(LocalDate.parse(sc.nextLine()));
                    System.out.print("Enter a city for your artist: \n>");
                    cities.add(sc.nextLine());
                    System.out.print("Enter a country for your artist: \n>");
                    countries.add(sc.nextLine());
                    Artist artist = new Artist(names.get(names.size()-1), DOBS.get(DOBS.size() -1), cities.get(cities.size() -1), countries.get(countries.size() -1));
                    break;
                case 4:
                    System.out.println("Enter an id to change information about an artist");
                    int j = 0;
                    while (j < artists.size()) {
                        if (sc.nextInt() == artists.get(j).getId()) {
                            System.out.println("What information would you like to change?\n" +
                                    "1 for name\n" +
                                    "2 for date of birth\n" +
                                    "3 for city\n" +
                                    "4 for country");
                            switch (sc.nextInt()) {
                                case 1:
                                    System.out.print("Enter a name\n>");
                                    sc.nextLine();
                                    artists.get(j).setArtistName(sc.nextLine());
                                    break;
                                case 2:
                                    System.out.print("Enter a date\n>");
                                    sc.nextLine();
                                    artists.get(j).setDateOfBirth(LocalDate.parse(sc.nextLine()));
                                    break;
                                case 3:
                                    System.out.print("Enter a city\n>");
                                    sc.nextLine();
                                    artists.get(j).setCity(sc.nextLine());
                                    break;
                                case 4:
                                    System.out.print("Enter a country\n>");
                                    sc.nextLine();
                                    artists.get(j).setCountry(sc.nextLine());
                                    break;
                                default:
                                    System.out.println("enter a number (1-4)");
                                    break;
                            }
                            break;
                        } else {
                            j++;
                        }
                    }
                    break;
                case 5:
                    BufferedWriter bw = new BufferedWriter(
                            new FileWriter("C:\\Users\\Mathi\\Desktop\\opg8.txt"));
                    try (BufferedWriter bufferedWriter = bw) {
                        i = 0;
                        while (i < artists.size()) {
                            bw.write(artists.get(i).sOut());
                            i++;
                        }
                        bw.close();
                        quit = true;
                        System.out.println("Thank you for using our system, see you again soon!");
                        return;
                    } catch (Exception ex) {
                        return;
                    }
                default:
                    System.out.println("Enter a number 1-4");
                    break;
            }
        }
    }

    public void menu() {
        System.out.print(
            "1 to pull artist info.\n" +
            "2 for artist with id.\n" +
            "3 to add artist.\n" +
            "4 to change artist (on id).\n" +
            "5 to save and quit!\n>"
        );
    }


}
