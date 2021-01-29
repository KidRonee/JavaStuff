public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("", "", 0, null);
        Book book2 = new Book("Booklet", "Douglas", 550, Genre.CRIME);
        book1.generateISBN();



    }
}
