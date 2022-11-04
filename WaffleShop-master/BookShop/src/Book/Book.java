// Component

package Book;

public abstract class Book {
    String description="";

    public abstract double cost();

    public String getDescription(){
        return description;
    }

    public void prepareBook(String type) {
        System.out.println("Choosing "+ type + " book");
    }

    public void cookBook(String type) {
        System.out.println(" Packing " + type + " book");
    }

    public void putOnBag(String type) {System.out.println("Put " + type + " book on the bag"); }
}
