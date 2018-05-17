import java.util.ArrayList;
import java.util.Collections;

public class App {

    public ArrayList<Integer> listOfCoins = new ArrayList<>();
    public ArrayList<Integer> listOfBilons = new ArrayList<>();
    
    public App() {
      Collections.addAll(listOfBilons, 50, 20, 10, 5, 2, 1);
    }

    public int coinChanger(int number) {
        if (listOfBilons.size() > 0) {
          decreaseByCoin(number, listOfBilons.get(0));
        }
        return listOfCoins.size();
    }

    public int decreaseByCoin(int number, int coin) {
        while(number >= coin) {
            listOfCoins.add(coin);
            number -= coin;
        };
        listOfBilons.remove(0);
        coinChanger(number);
        return number;
    }
}
