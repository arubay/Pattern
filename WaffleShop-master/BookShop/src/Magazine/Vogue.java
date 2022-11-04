package Magazine;

public class Vogue extends Prepare{
    @Override
    public double cost() {
        return 4.0;
    }

    @Override
    public String getDescription() {
        return "Vogue";
    }
}