package Book.BookDecorator;

import Book.Book;

public class FamousAuthor extends AuthorDecorator {
    Book book;

    public FamousAuthor(Book book){
        this.book = book;
    }

    @Override
    public double cost() { return 1.50 + book.cost(); }

    @Override
    public String getDescription() { return book.getDescription() + ", Famous"; }
}
