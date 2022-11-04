
public class BookOrder implements Command{
    Cook cook;
    String[] authorList, languageList, boundList;
    String order;
    public BookOrder(Cook cook, String order, String[] authorList, String[] languageList, String[] boundList){
        this.cook = cook;
        this.order = order;
        this.authorList = authorList;
        this.languageList = languageList;
        this.boundList = boundList;
    }

    @Override
    public void orderUp() {
        cook.bookType = order;
        cook.authorList = this.authorList;
        cook.languageList = this.languageList;
        cook.boundList = this.boundList;
        cook.getOrder("Book");
    }
}
