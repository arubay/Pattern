import Magazine.Magazine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    static String beverageType="";
    public static void main(String[] args) {
        Waitress waitress = new Waitress();
        Cook cook = new Cook();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("What do you want to buy?");
            System.out.println("(1) Book");
            System.out.println("(2) Magazine");
            System.out.println("(Other) I have finished.");

            int a = scanner.nextInt();
            if(a==1) {
                ArrayList<String> chocoList = new ArrayList<>();
                ArrayList<String> fruitList = new ArrayList<>();
                ArrayList<String> condimentList = new ArrayList<>();

                String waffleType = null;
                String answer = null;

                while (true) {
                    System.out.println("Which book do you want?");
                    System.out.println("(1) Fantastic --- 5.0$");
                    System.out.println("(2) Dystopia --- 4.0$");

                    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                    try {
                        answer = input.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    if (answer.equals("1")) {
                        waffleType = "Fantastic";
                        System.out.println("*** Fantastic is chosen.");
                        break;
                    } else if (answer.equals("2")) {
                        waffleType = "Dystopia";
                        System.out.println("*** Dystopia is chosen.");
                        break;
                    } else {
                        continue;
                    }
                }
                System.out.println("");

                System.out.println("-------------------- Details --------------------");
                Scanner scan = new Scanner(System.in);
                for (int i = 0; i < 2; i++) {
                    System.out.println("-------------------- Author --------------------");
                    System.out.println("(1)  --- 1.5$");
                    System.out.println("(2) Unusual --- 1.25$");
                    System.out.println("(Other) I finished the author section.");

                    int value = scan.nextInt();
                    if (value == 1) {
                        chocoList.add("Famous");
                        System.out.println("*** Famous author is chosen.");
                    } else if (value == 2) {
                        chocoList.add("Unusual");
                        System.out.println("*** Unusual author is chosen.");
                    } else break;
                }
                System.out.println("The selection of author is completed.");
                System.out.println("");

                Scanner scan2 = new Scanner(System.in);
                for (int i = 0; i < 3; i++) {
                    System.out.println("-------------------- Language --------------------");
                    System.out.println("(1) English --- 0.75$");
                    System.out.println("(2) Russian --- 0.65$");
                    System.out.println("(3) Kazakh --- 0.85$");
                    System.out.println("(Other) I finished the language selection.");
                    int value = scan2.nextInt();
                    if (value == 1) {
                        fruitList.add("English");
                        System.out.println("*** English is chosen.");
                    } else if (value == 2) {
                        fruitList.add("Russian");
                        System.out.println("*** Russian is chosen.");
                    } else if (value == 3) {
                        fruitList.add("Kazakh");
                        System.out.println("*** Kazakh is chosen.");
                    } else break;
                }
                System.out.println("The selection of language is completed.");
                System.out.println("");

                Scanner scan3 = new Scanner(System.in);
                for (int i = 0; i < 3; i++) {
                    System.out.println("-------------------- Bound book Types --------------------");
                    System.out.println("(1) Hardcover --- 2.5$");
                    System.out.println("(2) Softcover --- 0.1$");
                    System.out.println("(Other) I finished the bound book selection.");
                    int value = scan3.nextInt();
                    if (value == 1) {
                        condimentList.add("Hardcover");
                        System.out.println("*** Hardcover is chosen.");
                    } else if (value == 2) {
                        fruitList.add("Softcover");
                        System.out.println("*** Softcover is chosen.");
                    } else break;
                }
                System.out.println("The selection of bound book is completed.");
                System.out.println("");

                String[] chocoArr = new String[chocoList.size()];
                chocoArr = chocoList.toArray(chocoArr);

                String[] fruitArr = new String[fruitList.size()];
                fruitArr = fruitList.toArray(fruitArr);

                String[] condimentArr = new String[condimentList.size()];
                condimentArr = condimentList.toArray(condimentArr);

                BookOrder waffleOrder = new BookOrder(cook, waffleType, chocoArr, fruitArr, condimentArr);
                waitress.takeOrder(waffleOrder);
            }

            else if(a==2) {
                Scanner scanBeverage = new Scanner(System.in);
                System.out.println("-------------------- Magazine --------------------");
                for (int i = 0; i < 1; i++) {
                    System.out.println("-------------------- Magazines --------------------");
                    System.out.println("(1) Newspaper --- 2.5$");
                    System.out.println("(2) Vogue --- 5.5$");
                    System.out.println("(3) Cosmopolitan --- 4.0$");
                    System.out.println("(4) Forbes --- 4.5$");
                    System.out.println("(5) Maxim --- 4.0$");
                    System.out.println("(6) Hello! --- 4.0$");
                    System.out.println("(Other) I finished the magazine selection.");
                    int drink = scanBeverage.nextInt();
                    if(drink==1){
                        beverageType="Newspaper";
                        System.out.println("*** Newspaper is chosen.");
                    }
                    else if(drink==2){
                        beverageType="Vogue";
                        System.out.println("*** Vogue is chosen.");
                    }
                    else if(drink==3){
                        beverageType="Cosmopolitan";
                        System.out.println("*** Cosmopolitan is chosen.");
                    }
                    else if(drink==4){
                        beverageType="Maxim";
                        System.out.println("*** Maxim is chosen.");
                    }
                    else if(drink==5){
                        beverageType="Forbes";
                        System.out.println("*** Forbes is chosen.");
                    }
                    else if(drink==6){
                        beverageType="Hello!";
                        System.out.println("*** Hello! is chosen.");
                    }
                    else{
                        break;
                    }
                }
                System.out.println("The selection of magazine is completed.");
                System.out.println("");

                MagazineOrder beverageOrder = new MagazineOrder(cook, beverageType);
                waitress.takeOrder(beverageOrder);
            }

            else{
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("Thank you!");
                break;
            }
        }
    }
}
