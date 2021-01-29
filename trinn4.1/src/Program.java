import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    Scanner sc = new Scanner(System.in);

    public void runProgram() {
        System.out.println("Program running");
    }

    public void opppgave4() {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add(sc.nextLine());
        arrList.add(sc.nextLine());
        arrList.add(sc.nextLine());
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }
    }

    public void oppgave6() {
        int sum = 0;
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        intArray.add(sc.nextInt());
        for (int i = 0; i < intArray.size(); i++) {
            if (intArray.get(i) < 0) {
                intArray.remove(i);
                break;
            }
            intArray.add(sc.nextInt());
            sum += intArray.get(i);
        }
        System.out.println(sum);
    }

    public void oppgave7() {
        ArrayList<String> userString = new ArrayList<String>();
        int input = 0;
        String addString;
        System.out.println("press 1 to add a single word\npress 2 to display all words\npress 3 to exit\n");
        System.out.print("Enter number here: ");
        while (input != 3) {
            input = sc.nextInt();
            if (input == 1) {
                sc.nextLine();
                userString.add(sc.nextLine());
            } else if (input == 2) {
                for (int i = 0; i < userString.size(); i++) {
                    System.out.println("\n" + userString.get(i));
                    if (userString.get(i) == null) {
                        System.out.println("Cannot print empty Arraylist...");
                    }
                }
            } else if (input == 3) {
                System.out.println("Bye bye, butterfly!");
            }
        }
    }
}
