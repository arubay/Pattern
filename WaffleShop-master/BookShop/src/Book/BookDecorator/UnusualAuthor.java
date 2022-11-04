package Book.BookDecorator;

import Book.Book;

public class UnusualAuthor extends AuthorDecorator{
    Book book;

    public UnusualAuthor(Book book){
        this.book = book;
    }

    @Override
    public double cost() {
        return 1.25 + book.cost();
    }

    @Override
    public String getDescription() {
        return book.getDescription() + ", Unusual";
    }
}
