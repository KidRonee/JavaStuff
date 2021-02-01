import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {
    ArrayList<Artist> artists = new ArrayList<>();

    public Program() throws IOException {
        runProgram();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void oppgave8() throws IOException {
        File readFile = new File("C:\\Users\\Mathi\\Desktop\\opg7.txt");
        Scanner file = new Scanner(readFile);
        int i = 0;
        while (file.hasNextLine()) {
            String name = file.nextLine();
            LocalDate birthDate = LocalDate.parse(file.nextLine());
            String city = file.nextLine();
            String country = file.nextLine();
            String ignore = file.nextLine();
            artists.add(new Artist(name, city, country, birthDate));
            artists.get(i).setId(generateId());
            i++;
        }
        file.close();

        // creating file writer
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("C:\\Users\\Mathi\\Desktop\\opg81.txt")
        );
        try (BufferedWriter bufferedWriter = bw) {
            for (i = 0; i < artists.size(); i++) {
                bw.write(artists.get(i).printState());
            }
        } catch (Exception ex) {
            return;
        }
        bw.close();
    }

    // generates random int 0-1000000
    public int generateId() {
        Random id = new Random();
        return id.nextInt(1000000);
    }

    // runs program
    public void runProgram() throws IOException {
        oppgave8();
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        while (quit == false) {
            menu();
            switch (input.nextInt()) {
                case 1:
                    for (Artist artist : artists) {
                        System.out.println(artist.printState());
                    }
                    break;
                case 2:
                    System.out.print("Please enter an artist ID: >");
                    int i = 0;
                    for (Artist artist : artists) {
                        if (input.nextInt() == artist.getId()) {
                            System.out.println(artist.printState());
                            break;
                        }
                    }
                    System.out.println("No matches in our database");
                    break;
                case 3:
                    System.out.print("Enter a name for your artist: \n>");
                    String tempName = input.nextLine();
                    System.out.print("Enter a city for your artist: \n>");
                    String tempCity = input.nextLine();
                    System.out.print("Enter a country for your artist: \n>");
                    String tempCountry = input.nextLine();
                    System.out.print("Enter a birth date for your artist (yyyy-mm-dd): \n>");
                    LocalDate tempBirthdate = LocalDate.parse(input.next());
                    int generateID = generateId();
                    artists.add(new Artist(tempName, tempCity, tempCountry, tempBirthdate));
                    break;
                case 4:
                    System.out.println("Enter the artist id you wish to change information on: ");
                    for (Artist artist : artists) {
                        if (input.nextInt() == artist.getId()) {
                            System.out.println("What information would you like to change?\n" +
                                    "#1 name\n" +
                                    "#2 city\n" +
                                    "#3 country\n" +
                                    "#4 date of birth");
                            switch (input.nextInt()) {
                                case 1:
                                    System.out.print("Enter a name\n>");
                                    input.nextLine();
                                    artist.setName(input.nextLine());
                                    break;
                                case 2:
                                    System.out.print("Enter a city\n>");
                                    input.nextInt();
                                    artist.setCity(input.nextLine());
                                    break;
                                case 3:
                                    System.out.print("Enter a country\n>");
                                    input.nextLine();
                                    artist.setCountry(input.nextLine());
                                    break;
                                case 4:
                                    System.out.print("Enter a date (yyyy-mm-dd)\n>");
                                    input.nextLine();
                                    artist.setBirthDate(LocalDate.parse(input.nextLine()));
                                    break;
                                default:
                                    System.out.println("invalid input...");
                                    break;
                            }
                        }
                        System.out.println("No artists found...");
                        break;
                    }
                    break;
                case 5:
                    System.out.println("Saving...");
                    for (i = 0; i < 3; i++) {
                        System.out.println(".");
                    }
                    BufferedWriter bw = new BufferedWriter(
                            new FileWriter("C:\\Users\\Mathi\\Desktop\\newFile.txt"));
                    try (BufferedWriter bufferedWriter = bw) {
                        for (Artist artist : artists) {
                            bw.write(artist.printState());
                        }
                        bw.close();
                        System.out.println("done.\n");
                        System.out.println("Thank you for using my program, see you again soon!");
                        quit = true;

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                default:
                    System.out.println("Invalid input...");
                    break;
            }
        }
    }

    public void menu() {
        System.out.print(
                "#1 Display all artists info.\n" +
                        "#2 Lookup artist on ID.\n" +
                        "#3 Add artist.\n" +
                        "#4 Update artist (on id).\n" +
                        "#5 To save and quit!\n>"
        );
    }
}
