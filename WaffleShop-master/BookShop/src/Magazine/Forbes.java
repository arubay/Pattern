package Magazine;

public class Forbes extends Prepare {
    @Override
    public double cost() {
        return 4.0;
    }

    @Override
    public String getDescription() {
        return "Forbes";
    }
}
