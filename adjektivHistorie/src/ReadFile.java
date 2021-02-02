import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

    public ReadFile() {
        try {
            read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read() throws IOException {
        File readStory = new File("C:\\Users\\Mathi\\Desktop\\story.txt");
        FileReader fr = new FileReader(readStory);
        File readAdjectives = new File("C:\\Users\\Mathi\\Desktop\\adjektiv.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Mathi\\Desktop\\modifiedStory.txt"));
        Scanner file = new Scanner(readStory);
        Scanner adjective = new Scanner(readAdjectives);
        String tempAdjective;
        ArrayList<String> adjectives = new ArrayList<>();
        ArrayList<String> story = new ArrayList<>();
        while (adjective.hasNextLine()) {
            adjectives.add(adjective.nextLine());
        }
        adjective.close();
        while (file.hasNextLine()) {
            story.add(file.nextLine());
        }
        file.close();
        writer.close();
        System.out.println(story.get(0));
        System.out.println(story.get(1));
        System.out.println(story.get(2));
    }
}
