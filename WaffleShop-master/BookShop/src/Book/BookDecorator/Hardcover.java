package Book.BookDecorator;

import Book.Book;

public class Hardcover extends BoundBookDecorator {
    Book book;

    public Hardcover(Book book){
        this.book = book;
    }

    @Override
    public double cost() {
        return 2.5 + book.cost();
    }

    @Override
    public String getDescription() {
        return book.getDescription() + ", Hardcover";
    }
}
