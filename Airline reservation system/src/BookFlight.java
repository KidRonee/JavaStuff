import java.util.Scanner;

public class BookFlight {
    User user;
    String destination;
    String source;
    boolean isBooked;
    int payment;
    int price;
    public BookFlight () {
        System.out.println("Where would you like to depart from?");
        Scanner sc = new Scanner(System.in);
        this.source = sc.nextLine();
        System.out.println("Where would you like to arrive?");
        this.destination = sc.nextLine();
        if(this.source.equals(this.destination)) {
            System.out.println("You cannot travel to where you travel from, makes sense?");
            this.isBooked = false;
        } else {
            this.isBooked = true;
        }
    }

    public void flightInfo() {
        if (isBooked == true) {
            System.out.println("You have booked a flight from " + getSource() + " to " + getDestination() + "\nOn behalf of every member of our team we wish you a safe and pleasant flight.");
        } else {
            System.out.println("You have no booked flights in our systems");
        }

    }

    public int takePayment(int payment) {
        this.price = price;
        //int moneyInAccount = user.getAddFunds();
            if (payment >= price /*&& price <= moneyInAccount*/) {
                System.out.println("Thank you for your payment!");
                System.out.println(price + " has been withdrawn from your account.");
                isBooked = true;
            } else {
                isBooked = false;
                System.out.println("Insufficient funds.");
            }
        return payment;
    }

    public void flightPrices() {
        this.price = price;
        price = (int) Math.floor(Math.random()*10000);
        System.out.println(price);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }


}
