package az.edu.turing.finTheBestBooks;

import java.util.*;
import java.util.stream.Collectors;

public class BookApp {

    public static void main(String[] args) {

        List<Book> books= Arrays.asList(
                new Book("1984", "George Orwell", "Dystopian", 9.99, 4.8),
                new Book("To Kill a Mockingbird", "Harper Lee", "Classic", 12.50, 4.7),
                new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic", 10.75, 4.5),
                new Book("Moby Dick", "Herman Melville", "Adventure", 8.99, 4.2),
                new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", 15.00, 4.9),
                new Book("War and Peace", "Leo Tolstoy", "Historical", 20.00, 4.6),
                new Book("The Catcher in the Rye", "J.D. Salinger", "Fiction", 11.30, 4.0),
                new Book("Pride and Prejudice", "Jane Austen", "Romance", 7.99, 4.8),
                new Book("Brave New World", "Aldous Huxley", "Science Fiction", 9.50, 4.4),
                new Book("Crime and Punishment", "Fyodor Dostoevsky", "Philosophical", 14.75, 4.9)
        );

        List<Book> rPrice= books.stream().filter(book->book.getPrice()>10.0).collect(Collectors.toList());
        rPrice.forEach(System.out::println);

        System.out.println("----------------------------------------");

        List<Book> sortedBooks=books.stream().sorted(Comparator.comparing(Book::getPrice)).collect(Collectors.toList());
        sortedBooks.forEach(System.out::println);

        System.out.println("----------------------------------------");

        Optional<Book> maxRating=books.stream().max(Comparator.comparing(Book::getRating));
        maxRating.ifPresent(System.out::println);

        System.out.println("----------------------------------------");

        Map<String,List<Book>> groupingByGenre=books.stream().collect(Collectors.groupingBy(Book::getGenre));
        groupingByGenre.forEach((genre,bokList)->{
            System.out.println(genre+":");
            bokList.forEach(book -> System.out.println(" - "+book));
        });
    }
}
