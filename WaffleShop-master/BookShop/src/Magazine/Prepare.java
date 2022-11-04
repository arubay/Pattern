package Magazine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Prepare implements Magazine{
    public abstract double cost();
    public abstract String getDescription();

    //template method
    @Override
    public void prepareMagazine() {
        uncoverMagazine();
        pourInBag();

        if(customerWantsSticker()) {
            addSticker();
        }
    }

    public void uncoverMagazine(){
        System.out.println("Taking a magazine from the shelf");
    }

    public void pourInBag(){
        System.out.println("Putting it on a bad");
    }

    public void addSticker(){
        System.out.println("Adding sticker as a gift");
    }

    //hook
    public boolean customerWantsSticker(){
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            return true;
        }
        else
            return false;
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like sticker? (y/n)");

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(answer == null){
            answer = "no";
        }

        return answer;
    }
}
