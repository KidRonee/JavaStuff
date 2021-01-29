import java.util.*;

public class Main {

    public static void main (String[] args) {
        User user1 = new User();
        user1.welcome();
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        user1.AddFunds();
        if (answer.equals("yes") || answer.equals("y")) {
            BookFlight usr1 = new BookFlight();
            if (usr1.isBooked) {
                usr1.flightInfo();
                System.out.print("The price is: ");
                usr1.flightPrices();
                System.out.print("Please fill in the price to confirm you booking: ");
                usr1.payment = sc.nextInt();
                usr1.takePayment(usr1.payment);

            } else {
                usr1.flightInfo();
            }
        } else {
            System.out.println("Let us know when you do!");
        }


    }

}
