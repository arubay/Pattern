package Book.BookDecorator;


import Book.Book;

public class Softcover extends BoundBookDecorator{
    Book book;

    public Softcover(Book book){
        this.book = book;
    }

    @Override
    public double cost() {
        return 0.10 + book.cost();
    }

    @Override
    public String getDescription() {
        return book.getDescription() + ", Softcover";
    }
}
