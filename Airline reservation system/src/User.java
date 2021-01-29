import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.print.Book;
import java.util.Scanner;

public class User {
    String userName;
    String homeCountry;
    String address;
    int age;
    String cc;
    int addFunds;
    int moneyInAccount;
    Scanner sc = new Scanner(System.in);


    public User () {

    }

    public boolean welcome () {
        System.out.println("Welcome to Moldevort Airlines!\nWe provide the best airborne service known by man.\nPlease fill inn the following information:");
        System.out.print("Your full name: ");
        this.userName = sc.nextLine();
        System.out.print("Your home country: ");
        this.homeCountry = sc.nextLine();
        System.out.print("Your address: ");
        this.address = sc.nextLine();
        System.out.print("Your credit card number: ");
        this.cc = sc.nextLine();
        for (int i  = 0; i < 4; i++) {
            if (this.cc.length() != 16) {
                System.out.println("You have " + (4-i) + " tries left.");
                System.out.print("Please enter a 16 digit number: ");
                this.cc = sc.nextLine();
            } else {
                System.out.println("Congratulations," + this.userName + " you are officially a member of Moldevort airlines!");
                break;
            }



        }
        System.out.println("Would you like to book a flight right away?");
        return true;
    }

    public int AddFunds() {
        System.out.print("Please add some funds to your account: ");
        this.addFunds = sc.nextInt();
        this.moneyInAccount += addFunds;
        return this.moneyInAccount;
    }

    public int getAddFunds() {
        return addFunds;
    }

    public void setAddFunds(int addFunds) {
        this.addFunds = addFunds;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHomeCountry() {
        return homeCountry;
    }

    public void setHomeCountry(String homeCountry) {
        this.homeCountry = homeCountry;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }
}


