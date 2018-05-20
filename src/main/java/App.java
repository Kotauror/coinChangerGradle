import java.util.ArrayList;
import java.util.Collections;

public class App {

    public static ArrayList<Integer> CoinsOfUser = new ArrayList<>();
    public static ArrayList<Integer> listOfCoins = new ArrayList<>();

    public App() {
      Collections.addAll(listOfCoins, 50, 20, 10, 5, 2, 1);  
    }

    public static void main(String[] args) {
      App tester = new App();
      tester.coinChanger(78);
      tester.resultPrinter(CoinsOfUser);
    }

    public ArrayList<Integer> coinChanger(int numberToChange) {
        if (listOfCoins.size() > 0) {
          decreaseByACoin(numberToChange, listOfCoins.get(0));
        }
        return CoinsOfUser;
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

    public static String resultPrinter(ArrayList<Integer> userFinalCoins) {
        String coinWord;
        if (userFinalCoins.size() == 1) coinWord = " coin: "; else coinWord = " coins: ";
        System.out.print("You will get " + userFinalCoins.size() + coinWord + userFinalCoins);
        return "You will get " + userFinalCoins.size() + coinWord + userFinalCoins;
    }
}
