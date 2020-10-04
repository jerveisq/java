package ClassesModule;

import java.util.ArrayList;

public class Library {
    static ArrayList<Book> library = new ArrayList<>();
    static ArrayList<Book> booksByAuthor = new ArrayList<>();
    static ArrayList<Book> booksByPublishingHouse = new ArrayList<>();
    static ArrayList<Book> booksReleasedAfterEnteredYear = new ArrayList<>();

    public static void main(String[] args) {
    fillingTheLib();
    byAuthor("Jane Austen");
        getBookByAuthor();
    byPublishingHouse("Raulph");
        getBookByPublishingHouse();
    releasedAfterEnteredYear(1940);
        getBookReleasedAfterEnteredYear();
    }

    public static void fillingTheLib(){
        Book first = new Book(1, "Pride and prejudice", "Jane Austen", "Hope", 1813, 321, 30.50, "soft");
        Book second = new Book(2, "Persuasion", "Jane Austen", "Hope", 1818, 128, 21.40, "hard");
        Book third = new Book(3, "Arc de Triomphe", "Erich Maria Remarque", "Vaid", 1949, 256, 32.00, "hard");
        Book fourth = new Book(4, "Die Nacht von Lissabon", "Erich Maria Remarque", "Vaid", 1945, 135, 22.20, "soft");
        Book fifth = new Book(5, "Drei Kameraden", "Erich Maria Remarque", "Raulph", 1962, 189, 25.90, "soft");
        library.add(first);
        library.add(second);
        library.add(third);
        library.add(fourth);
        library.add(fifth);
    }

    public static Book byAuthor(String author){
        Book current = null;
        for (Book temp : library){
            if (temp.getAuthor().equals(author)){
                current = temp;
                booksByAuthor.add(temp);
            }
        }
        return current;
    }

    private static void getBookByAuthor() {
        System.out.println("Books by this author:");
        for (Book book : booksByAuthor) {
            System.out.println(book);
        }
    }

    public static Book byPublishingHouse(String publishingHouse){
        Book current = null;
        for (Book temp : library){
            if (temp.getPublishingHouse().equals(publishingHouse)){
                current = temp;
                booksByPublishingHouse.add(temp);
            }
        }
        return current;
    }

    private static void getBookByPublishingHouse() {
        System.out.println("Books by this publishing house:");
        for (Book book : booksByPublishingHouse) {
            System.out.println(book);;
        }
    }

    public static Book releasedAfterEnteredYear(int enterTheYear){
        Book current = null;
        for (Book temp : library){
            if (temp.getReleaseDate() > enterTheYear){
                current = temp;
                booksReleasedAfterEnteredYear.add(temp);
            }
        }
        return current;
    }

    private static void getBookReleasedAfterEnteredYear() {
        System.out.println("Books, which were released after this year:");
        for (Book book : booksReleasedAfterEnteredYear) {
            System.out.println(book);
        }
    }
}