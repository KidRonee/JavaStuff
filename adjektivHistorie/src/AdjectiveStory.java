import java.io.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

// This class takes in an adjective story (text file) and replaces "__" with a random adjective.
public class AdjectiveStory {
    ArrayList<String> adjectives = new ArrayList<String>();

    public AdjectiveStory() throws IOException {
        Scanner input = new Scanner(System.in);
        menu();
        if (input.nextInt() == 1) {
            welcome();

            switch (input.nextInt()) {
                case 1:
                    addAdjectivesFromFileToArraylist();
                    createAdjectiveStory();
                    break;
                case 2:
                    addAdjectivesFromFileToArraylist();
                    userCreateStory();
                    break;
                case 3:
                    System.out.println("Catch you later alligator!");
                    break;
                default:
                    System.out.println("Wrong input, exiting...");
                    break;
            }
        } else {
            System.out.println("See you in a while crocodile");
        }
    }

    public void addAdjectivesFromFileToArraylist() throws IOException {
        FileReader reader = new FileReader("C:\\Users\\Mathi\\Desktop\\adjektiv.txt");
        Scanner scanAdjectives = new Scanner(reader);
        while (scanAdjectives.hasNextLine()) {
            adjectives.add(scanAdjectives.nextLine());
        }
        reader.close();
    }

    public void createAdjectiveStory() throws IOException {
        FileReader reader = new FileReader("C:\\Users\\Mathi\\Desktop\\story.txt");
        Scanner scanStory = new Scanner(reader);
        BufferedWriter writer = new BufferedWriter(
                new FileWriter("C:\\Users\\Mathi\\Desktop\\modifiedStory.txt")
        );

        while(scanStory.hasNextLine()){
            int i = 0;

            String currentLine = scanStory.nextLine();
            String[] words = currentLine.split(" ");
            StringBuilder sentences = new StringBuilder();
            for(String word : words){
                Random index = new Random();
                int randomIndex = index.nextInt(adjectives.size());
                if(word.equals("__")){
                    sentences.append(adjectives.get(randomIndex)).append(" "); // This does not work atm
                }
                else {
                    sentences.append(word).append(" ");
                }
            }
            writer.write(sentences + "\n");
        }
        reader.close();
        writer.close();
    }

    public void userCreateStory() throws IOException {
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        FileReader reader = new FileReader("C:\\Users\\Mathi\\Desktop\\story.txt");
        Scanner scanStory = new Scanner(reader);
        System.out.print("Please select a name for your file (i'll take care of the file type (:\n>");
        String fileName = createTextFile();
        String fileLocation = "C:\\Users\\Mathi\\Desktop\\" + fileName + ".txt";
        BufferedWriter writer = new BufferedWriter(
                new FileWriter(fileLocation)
        );

        while(scanStory.hasNextLine()){
            int i = 0;
            Scanner input = new Scanner(System.in);
            String currentLine = scanStory.nextLine();
            String[] words = currentLine.split(" ");
            StringBuilder sentences = new StringBuilder();
            for(String word : words){
                Random index = new Random();
                if(word.equals("__")){
                    System.out.println("#1 to choose your own adjective\n#2 for a prefixed list of adjectives");
                    switch (input.nextInt()) {
                        case 1:
                            System.out.println(currentLine);
                            System.out.print("Type your adjective here: >");
                            input.nextLine(); //flushing linefeed
                            sentences.append(input.nextLine().toLowerCase()).append(" ");
                            break;
                        case 2:
                            System.out.println("Please select a number from the list below to replace '__'");
                            for (i = 0; i <= 10; i++) {
                                int randomIndex = index.nextInt(adjectives.size());
                                System.out.println("#" + i + " " + adjectives.get(randomIndex));
                                indexes.add(randomIndex);
                            }
                            System.out.println(currentLine);
                            switch (input.nextInt()) {
                                case 1:
                                    sentences.append(adjectives.get(indexes.get(0))).append(" ");
                                    break;
                                case 2:
                                    sentences.append(adjectives.get(indexes.get(1))).append(" ");
                                    break;
                                case 3:
                                    sentences.append(adjectives.get(indexes.get(2))).append(" ");
                                    break;
                                case 4:
                                    sentences.append(adjectives.get(indexes.get(3))).append(" ");
                                    break;
                                case 5:
                                    sentences.append(adjectives.get(indexes.get(4))).append(" ");
                                    break;
                                case 6:
                                    sentences.append(adjectives.get(indexes.get(5))).append(" ");
                                    break;
                                case 7:
                                    sentences.append(adjectives.get(indexes.get(6))).append(" ");
                                    break;
                                case 8:
                                    sentences.append(adjectives.get(indexes.get(7))).append(" ");
                                    break;
                                case 9:
                                    sentences.append(adjectives.get(indexes.get(8))).append(" ");
                                    break;
                                case 10:
                                    sentences.append(adjectives.get(indexes.get(9))).append(" ");
                                    break;
                                default:
                                    System.out.println("invalid number...");
                            }
                        break;
                    }
                }
                else {
                    sentences.append(word).append(" ");
                }
                indexes = new ArrayList<Integer>();
            }


            System.out.println(sentences);
            writer.write(String.valueOf(sentences + "\n"));
        }
        reader.close();
        writer.close();
    }

    public String createTextFile() {
        Scanner input = new Scanner(System.in);
        return input.nextLine() + ".txt";
    }



    public void welcome() {
        System.out.println("Welcome to storyBuilder.v1");
        System.out.println("This program is designed to allow its users to build an adjective story.");
        System.out.println("#1 to generate story.");
        System.out.println("#2 to make your own story.");
        System.out.print("#3 to exit.\n>");
    }

    public void menu() {
        System.out.println("Enter #1 to begin!");
        System.out.print("Enter #2 to exit.\n>");
    }
}
