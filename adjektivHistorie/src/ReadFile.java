import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ReadFile {

    public void read() throws IOException {
        FileReader readAdjectives = new FileReader("C:\\Users\\Mathi\\Desktop\\adjektiv.txt");
        Scanner scanAdjectives = new Scanner(readAdjectives);
        FileReader readStory = new FileReader("C:\\Users\\Mathi\\Desktop\\story.txt");
        Scanner scanStory = new Scanner(readStory);

        ArrayList<String> adjectives = new ArrayList<>();
        ArrayList<String> story = new ArrayList<>();

        while (scanAdjectives.hasNextLine()) {
            adjectives.add(scanAdjectives.nextLine());
        }
        readAdjectives.close();

        Random index = new Random();
        while(scanStory.hasNextLine()){
            String currentLine = scanStory.nextLine();
            String[] words = currentLine.split(" ");
            for(String word : words){
                if(word.equals("__")){
                    story.add(adjectives.get(index.nextInt(adjectives.size())));
                }
                else {
                    story.add(word);
                }
            }
        }
        readStory.close();

        BufferedWriter writer = new BufferedWriter(
                new FileWriter("C:\\Users\\Mathi\\Desktop\\modifiedStory.txt")
        );

        StringBuilder storyAsStringBuilder = new StringBuilder();
        String storyWithLineBreaks;
        int i = 0;
        for (String word : story) {
            if (i < 3) {
                storyAsStringBuilder.append(word).append(" ");
            }
            else if (i == 3){
                storyAsStringBuilder.append("\n").append(word).append(" ");
            }
            else {
                storyAsStringBuilder.append(word).append(" ");
            }
            i++;
        }

        storyWithLineBreaks = String.valueOf(storyAsStringBuilder).replaceAll("(.{100})", "$1\n");

        writer.write(storyWithLineBreaks);
        writer.close();



    }
}
