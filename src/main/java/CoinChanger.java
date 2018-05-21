import java.util.ArrayList;
import java.util.Collections;

public class CoinChanger {

  final int[] listOfCoins = {50, 20, 10, 5, 2, 1};

  public int[] changeCoins(int numberToChange, int indexOfCheckedCoin) {
    if (indexOfCheckedCoin < listOfCoins.length) {
      int coin = listOfCoins[indexOfCheckedCoin];
      while (numberToChange >= coin) {
        coinsOfUser.add(coin);
        numberToChange -= coin;
      }
      indexOfCheckedCoin += 1;
      changeCoins(numberToChange, indexOfCheckedCoin);
    }
    return coinsOfUser.stream().mapToInt(i -> i).toArray();
  }

}
