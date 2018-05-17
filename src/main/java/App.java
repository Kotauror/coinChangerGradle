import java.util.ArrayList;
import java.util.Collections;

public class App {

    public ArrayList<Integer> CoinsOfUser = new ArrayList<>();
    public ArrayList<Integer> listOfCoins = new ArrayList<>();
    
    public App() {
      Collections.addAll(listOfCoins, 50, 20, 10, 5, 2, 1);
    }

    public int coinChanger(int number) {
        if (listOfCoins.size() > 0) {
          decreaseByCoin(number, listOfCoins.get(0));
        }
        return CoinsOfUser.size();
    }

    public int decreaseByCoin(int number, int coin) {
        while(number >= coin) {
            CoinsOfUser.add(coin);
            number -= coin;
        };
        listOfCoins.remove(0);
        coinChanger(number);
        return number;
    }
}
