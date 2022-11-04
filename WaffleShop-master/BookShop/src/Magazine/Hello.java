package Magazine;

public class Hello extends Prepare{
    @Override
    public double cost() {
        return 4.0;
    }

    @Override
    public String getDescription() {
        return "Hello!";
    }
}
