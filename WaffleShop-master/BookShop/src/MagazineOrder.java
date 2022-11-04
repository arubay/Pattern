public class MagazineOrder implements Command{
    Cook cook;
    String order;
    public MagazineOrder(Cook cook, String order){
        this.cook = cook;
        this.order= order;
    }

    @Override
    public void orderUp() {
        cook.magazineType = order;
        cook.getOrder("Magazine");
    }
}
