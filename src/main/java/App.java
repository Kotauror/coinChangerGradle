import java.util.ArrayList;
import java.util.Collections;

public class App {

    public static ArrayList<Integer> CoinsOfUser = new ArrayList<>();
    final int[] listOfCoins = {50, 20, 10, 5, 2, 1};

    App () {}

    public static void main(String[] args) {
      App app = new App();
      app.changeCoins(73, 0);
      System.out.println(CoinsOfUser);
    }

    public ArrayList<Integer> changeCoins(int numberToChange, int indexOfCheckedCoin) {
      if (indexOfCheckedCoin < listOfCoins.length) {
        int coin = listOfCoins[indexOfCheckedCoin]; 
        while (numberToChange >= coin) {
          CoinsOfUser.add(coin); 
          numberToChange -= coin;
        }
        indexOfCheckedCoin += 1; 
        changeCoins(numberToChange, indexOfCheckedCoin);
      }
      return CoinsOfUser;
    }
}
