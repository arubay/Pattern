//Concrete Component

package Book;

public class Dystopia extends Book {
    public  Dystopia(){
        description = "Dystopia";
    }

    @Override
    public double cost() {
        return 4.00;
    }
}
