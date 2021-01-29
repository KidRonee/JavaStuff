import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {


    public void runProgram() {
        System.out.println("Program starting");
    }

    public void oppgave4() {
        Scanner input = new Scanner(System.in);
        ArrayList<String> userInput = new ArrayList<>();
        System.out.println("Please enter 3 strings of your choice!");
        System.out.print("string1: ");
        userInput.add(input.nextLine());
        System.out.print("string2: ");
        userInput.add(input.nextLine());
        System.out.print("string3: ");
        userInput.add(input.nextLine());

        for (int i = 0; i < userInput.size(); i++) {
            System.out.println(userInput.get(i));
        }
    }

    public void oppgave6() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        while (i >= 0) {
            System.out.print("Please enter a number (-1 to exit): ");
            i = sc.nextInt();
            if (i < 0) {
                break;
            }
            sum += i;
        }
        System.out.println(sum);
    }

    public void oppgave7() {
        ArrayList<String> userStrings = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to add a single word\nPress 2 to display all words\nPress 3 to exit");
        while(true) {
            System.out.print("> ");
            switch (sc.nextInt()) {
                case 1:
                    System.out.print("Enter your string here: ");
                    sc.nextLine(); // consume newline leftover
                    userStrings.add(sc.nextLine());
                    break;
                case 2:
                    for (int j = 0; j < userStrings.size(); j++) {
                        System.out.println(userStrings.get(j));
                    }
                    break;
                case 3:
                    System.out.println("Bye bye butterfly");
                    return;
                default:
                    System.out.println("Invalid input, please type in a number between 1-3");
                    break;
            }
        }
    }


}
