import Magazine.*;

public class MagazineFactory {

    public Magazine makeMagazine(String magazineType) {
        if (magazineType.equals(null)){
            return null;
        }
        else if(magazineType.equals("Newspaper")){
            return new Newspaper();
        }
        else if(magazineType.equals("Vogue")){
            return new Vogue();
        }
        else if(magazineType.equals("Cosmopolitan")){
            return new Cosmopolitan();
        }
        else if(magazineType.equals("Forbes")){
            return new Forbes();
        }
        else if(magazineType.equals("Maxim")){
            return new Maxim();
        }
        else if(magazineType.equals("Hello!")){
            return new Hello();
        }
        return null;
    }

}
