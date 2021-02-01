public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("", "",  0, null);
        BookRegister bokRegister = new BookRegister();
        bokRegister.addNPCBooks();
        bokRegister.getBooksByAuthor();
        bokRegister.getBooksInGenre();
    }
}