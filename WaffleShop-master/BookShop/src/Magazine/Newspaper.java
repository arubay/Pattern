package Magazine;

public class Newspaper extends Prepare{
    @Override
    public double cost() {
        return 4.0;
    }

    @Override
    public String getDescription() {
        return "Newspaper";
    }
}