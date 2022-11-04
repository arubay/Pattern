package Book.BookDecorator;

import Book.Book;

public class English extends LanguageDecorator{
    Book book;

    public English(Book book){
        this.book = book;
    }

    @Override
    public double cost() {
        return 0.75 + book.cost();
    }

    @Override
    public String getDescription() {
        return book.getDescription() + ", English";
    }
}
