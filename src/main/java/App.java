import java.util.ArrayList;
import java.util.Collections;

public class App {

    public static ArrayList<Integer> CoinsOfUser = new ArrayList<>();
    public static ArrayList<Integer> listOfCoins = new ArrayList<>();

    App () {
      Collections.addAll(listOfCoins, 50, 20, 10, 5, 2, 1);  
    }

    public static void main(String[] args) {
      App tester = new App();
      tester.coinChanger(78, 0);
      tester.resultPrinter(CoinsOfUser);
    } 

    public static int indexOfCheckedCoin = 0;

    public ArrayList<Integer> coinChanger(int numberToChange, int indexOfCheckedCoin) {
        if (indexOfCheckedCoin < 6) {
          decreaseByACoin(numberToChange, listOfCoins.get(indexOfCheckedCoin));
        }
        return CoinsOfUser;
    }

    public int decreaseByACoin(int numberToChange, int coin) {
        while(numberToChange >= coin) {
            CoinsOfUser.add(coin);
            numberToChange -= coin;
        };
        indexOfCheckedCoin += 1;
        coinChanger(numberToChange, indexOfCheckedCoin);
        return numberToChange;
    }

    public static String resultPrinter(ArrayList<Integer> userFinalCoins) {
        String coinWord;
        if (userFinalCoins.size() == 1) coinWord = " coin: "; else coinWord = " coins: ";
        System.out.print("You will get " + userFinalCoins.size() + coinWord + userFinalCoins);
        return "You will get " + userFinalCoins.size() + coinWord + userFinalCoins;
    }
}
