import Magazine.Magazine;
import Book.Book;
import Book.BookDecorator.*;
import Book.BookDecorator.UnusualAuthor;
import Book.BookDecorator.Russian;
import Book.BookDecorator.FamousAuthor;

// Receiver
public class Cook {
    public static String bookType="";
    public static String magazineType="";
    public static String[] authorList = null;
    public static String[] languageList = null;
    public static String[] boundList = null;
    Book book;
    Magazine magazine;
    public void getOrder(String factoryType){
        if(factoryType.equalsIgnoreCase("Book")){
            System.out.println(bookType + " order received.");

            BookFactory factory =  new BookFactory();
            book = factory.makeBook(bookType);

            book.prepareBook(bookType);
            book.cookBook(bookType);
            book.putOnBag(bookType);
            book = decorate(authorList, languageList, boundList);

            System.out.println(book.getDescription() + " order completed.");
            System.out.println("Cost: $" + book.cost());

        }
        else if(factoryType.equalsIgnoreCase("Beverage")){
            System.out.println(magazineType + " order received.");

            MagazineFactory factory = new MagazineFactory();
            magazine = factory.makeMagazine(magazineType);
            magazine.prepareMagazine();

            System.out.println(magazine.getDescription() + " order completed.");
            System.out.println("Cost: $" + magazine.cost());
        }
        System.out.println("");
    }

    public Book decorate(String[] chocoList, String[] fruitList, String[] condimentList){
        for (int i = 0; i < chocoList.length; i++) {
            String choco = chocoList[i];
            if(choco.equals("Famous")){
                book = new FamousAuthor(book);
            }
            else if(choco.equals("Unusual")){
                book = new UnusualAuthor(book);
            }
        }

        for (int i = 0; i < fruitList.length; i++) {
            String fruit = fruitList[i];
            if(fruit.equals("English")){
                book = new English(book);
            }
            else if(fruit.equals("Russia")){
                book = new Russian(book);
            }
            else if(fruit.equals("Kazakh")){
                book = new Kazakh(book);
            }
        }

        for (int i = 0; i < condimentList.length; i++) {
            String condiment = condimentList[i];
            if(condiment.equals("Softcover")){
                book = new Softcover(book);
            }
            else if(condiment.equals("Hardcover")){
                book = new Hardcover(book);
            }
        }
        return book;
    }
}
