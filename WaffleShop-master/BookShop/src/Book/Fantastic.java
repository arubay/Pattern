//Concrete Component

package Book;

public class Fantastic extends Book {
    public Fantastic(){
        description = "Fantastic";
    }

    @Override
    public double cost() {
        return 5.00;
    }
}
