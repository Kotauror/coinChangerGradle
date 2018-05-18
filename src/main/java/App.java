import java.util.ArrayList;
import java.util.Collections;

public class App {

    public ArrayList<Integer> CoinsOfUser = new ArrayList<>();
    public ArrayList<Integer> listOfCoins = new ArrayList<>();

    public App() {
      Collections.addAll(listOfCoins, 50, 20, 10, 5, 2, 1);
    }

    public static void main(String[] args) {
      App tester = new App();
      int finalResult = tester.coinChanger(52);
      resultPrinter(finalResult);
    }

    public int coinChanger(int numberToChange) {
        if (listOfCoins.size() > 0) {
          decreaseByACoin(numberToChange, listOfCoins.get(0));
        }
        return CoinsOfUser.size();
    }

    public int decreaseByACoin(int numberToChange, int coin) {
        while(numberToChange >= coin) {
            CoinsOfUser.add(coin);
            numberToChange -= coin;
        };
        listOfCoins.remove(0);
        coinChanger(numberToChange);
        return numberToChange;
    }

    public static void resultPrinter(int finalResult) {
      if (finalResult == 1)
         System.out.print("You will get: " + finalResult + " coin");
      else
        System.out.print("You will get: " + finalResult + " coins"); 
    }
}
