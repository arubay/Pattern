import Book.*;

public class BookFactory {

    public Book makeBook(String bookType) {
        if(bookType.equals("Fantastic")){
            return new Fantastic();
        }
        else if(bookType.equals("Dystopia")){
            return new Dystopia();
        }
        return null;
    }

}
