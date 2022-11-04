package Book.BookDecorator;

import Book.Book;

public class Kazakh extends LanguageDecorator {
    Book book;

    public Kazakh(Book book){
        this.book = book;
    }

    @Override
    public double cost() {
        return 0.85 + book.cost();
    }

    @Override
    public String getDescription() {
        return book.getDescription() + ", Kazakh";
    }
}
