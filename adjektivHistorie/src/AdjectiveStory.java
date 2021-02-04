import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// This class takes in an adjective story (text file) and replaces "__" with a random adjective.
public class AdjectiveStory {
    ArrayList<String>[] adjectives = new ArrayList[7];
    Random index = new Random();

    public AdjectiveStory() throws IOException {
        Scanner input = new Scanner(System.in);
        addAdjectivesFromFileToArraylist();
        //createAdjectiveStory();

        welcome();

        if (input.nextInt() == 1) {
            menu();
            if (input.nextInt() == 1) {
                userMakeStory();
            } else {
                System.out.println("Are you sure you wish to exit? (y/n)");
                //input.nextLine(); // controlling linefeed
                input.nextLine(); // controlling linefeed
                if (input.nextLine().equals("y")) {
                    System.out.println("See you later alligator!\n\n\n\n\t See you in a while, crocodile.");
                } else {
                    userMakeStory();
                }
            }
        } else {
            System.out.println("#1 is your only option for now...");
        }
    }

    public void addAdjectivesFromFileToArraylist() throws IOException {
        FileReader reader = new FileReader("C:\\Users\\Mathi\\Desktop\\adjektiv.txt");
        Scanner scanAdjectives = new Scanner(reader);
        int i;
        for (i = 0; i < 7; i++) {
            adjectives[i] = new ArrayList<String>();
        }
        i = 0;
        while (scanAdjectives.hasNextLine()) {
            if (adjectives[i].size() > 10) {
                i++;
            }
            adjectives[i].add(scanAdjectives.nextLine());
        }
        reader.close();
    }

    // dont use this method, it is incomplete
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
                if(word.equals("__")){
                    sentences.append(adjectives[i].get(index.nextInt(adjectives[i].size()))).append(" "); // This does not work atm
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
        int k = 0;
        System.out.print("Select an adjective to replace '__'");
        while(scanStory.hasNextLine()){
            if (k > 7) {
                k = 0;
            }
            for (String adjective : adjectives[k]) {
                if (i % 3 == 0) {
                    System.out.print("\n");
                }
                System.out.print("#" + i + " " + adjective + " | ");
                i++;
            }
            System.out.println("\n" +scanStory.nextLine());
            System.out.print(">");
            int userChoice = input.nextInt();
            userAdjectives.add(adjectives[k].get(userChoice));
            adjectives[k].remove(userAdjectives.get(j));
            j++;
            k++;
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
        System.out.print("Enter #2 to make your own story (coming soon).\n>");
    }

    public void menu() {
        System.out.println("Enter #1 to begin!");
        System.out.print("Enter #2 to exit.\n>");
    }
}
