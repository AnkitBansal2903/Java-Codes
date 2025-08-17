package Interface;

public class Book {

    static int totalNoOfBooks;

    String title;

    String author;

    String isbn;

    boolean isBorrowed;

    static {
        totalNoOfBooks = 0;
    }

    {
        totalNoOfBooks++;

    }


    Book(String isbn, String title , String author){
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    Book(String isbn) {
        this(isbn,"unknown", "unknown");
    }

    static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy the book " + this.title);
        }
    }

    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed " + this.title);
        } else {
            System.out.println("This book is already in the library");
        }
    }

    public static void main(String[] args) {
        Book designOfThings = new Book("1" , "design" , "Author");
        Book mybook = new Book("5" );
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();


    }

}
