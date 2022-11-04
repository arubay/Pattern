package Book.BookDecorator;

import Book.Book;

public class Russian extends LanguageDecorator {
    Book book;

    public Russian(Book book){
        this.book = book;
    }

    @Override
    public double cost() {
        return 0.60 + book.cost();
    }

    @Override
    public String getDescription() {
        return book.getDescription() + ", Russian";
    }
}
