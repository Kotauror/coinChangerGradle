import java.util.ArrayList;
import java.util.Collections;
import CoinChanger.;

public class App {

    public static ArrayList<Integer> coinsOfUser = new ArrayList<>();
    final int[] listOfCoins = {50, 20, 10, 5, 2, 1};

    App () {}

    public static void main(String[] args) {
      CoinChanger coinChanger = new CoinChanger();
      int[] finalCoinsOfUser = coinChanger.changeCoins(73, 0);
      System.out.println(finalCoinsOfUser);
    }

    // public int[] changeCoins(int numberToChange, int indexOfCheckedCoin) {
    //   if (indexOfCheckedCoin < listOfCoins.length) {
    //     int coin = listOfCoins[indexOfCheckedCoin];
    //     while (numberToChange >= coin) {
    //       coinsOfUser.add(coin);
    //       numberToChange -= coin;
    //     }
    //     indexOfCheckedCoin += 1;
    //     changeCoins(numberToChange, indexOfCheckedCoin);
    //   }
    //   return coinsOfUser.stream().mapToInt(i -> i).toArray();
    // }
}
