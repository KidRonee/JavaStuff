import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// This class takes in an adjective story (text file) and replaces "__" with a random adjective.
public class AdjectiveStory {
    ArrayList<String> adjectives = new ArrayList<>();
    Random index = new Random();

    public AdjectiveStory() throws IOException {
        addAdjectivesFromFileToArraylist();
        //createAdjectiveStory();
        welcome();
        menu();
        userMakeStory();
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
            String currentLine = scanStory.nextLine();
            String[] words = currentLine.split(" ");
            StringBuilder sentences = new StringBuilder();

            for(String word : words){
                if(word.equals("__")){
                    sentences.append(adjectives.get(index.nextInt(adjectives.size()))).append(" ");
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

    public String createTextFile() {
        Scanner input = new Scanner(System.in);
        return input.nextLine() + ".txt";
    }

    public void userMakeStory() throws IOException {
        FileReader reader = new FileReader("C:\\Users\\Mathi\\Desktop\\story.txt");
        Scanner scanStory = new Scanner(reader);
        Scanner input = new Scanner(System.in);
        ArrayList<String> userAdjectives = new ArrayList<>();
        StringBuilder badName = new StringBuilder();
        int i = 0;
        int j = 0;
        System.out.println("Select an adjective to replace '__'");
        while(scanStory.hasNextLine()){
            for (String adjective : adjectives) {
                System.out.println("#" + i + " for " + adjective);
                i++;
            }
            System.out.println(scanStory.nextLine());
            System.out.print(">");
            int userChoice = input.nextInt();
            userAdjectives.add(adjectives.get(userChoice-1));
            adjectives.remove(userAdjectives.get(j));
            j++;
            String currentLine = scanStory.nextLine();
            String[] words = currentLine.split(" ");
            StringBuilder sentences = new StringBuilder();
            i = 0;
            for(String word : words){
                if(word.equals("__")){
                    sentences.append(userAdjectives.get(i)).append(" ");
                    i++;
                }
                else {
                    sentences.append(word).append(" ");
                }
            }
            badName.append(sentences).append("\n");
        }
        reader.close();
        System.out.print("Please select a name for your file (i'll take care of the file type (:\n>");
        String fileName = createTextFile();
        String fileLocation = "C:\\Users\\Mathi\\Desktop\\" + fileName + ".txt";
        BufferedWriter writer = new BufferedWriter(
                new FileWriter(fileLocation)
        );
        System.out.println(badName);
        writer.write(String.valueOf(badName));
        writer.close();
    }



    public void welcome() {
        System.out.println("Welcome to storyBuilder.v1");
        System.out.println("This program is designed to allow its users to build an adjective story.");
        System.out.println("Enter #1 to pick a random story.");
        System.out.println("Enter #2 to make your own story (coming soon).");
    }

    public void menu() {
        System.out.println("Enter #1 to begin!");
        System.out.println("Enter #2 to exit.");
    }
}
