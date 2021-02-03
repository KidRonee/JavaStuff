import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// This class takes in an adjective story (text file) and replaces "__" with a random adjective.
public class ReadFile {
    ArrayList<String> adjectives = new ArrayList<>();
    Random index = new Random();

    public ReadFile() throws IOException {
        addAdjectivesFromFileToArraylist();
        createAdjectiveStory();
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
}
