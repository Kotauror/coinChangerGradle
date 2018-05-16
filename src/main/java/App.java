import java.util.ArrayList;

public class App {

    public ArrayList<Integer> listOfCoins = new ArrayList<>();
    public ArrayList<Integer> listOfBilons = new ArrayList<>();
    
    public App() {
      listOfBilons.add(0, 50); 
      listOfBilons.add(1, 20); 
      listOfBilons.add(2, 10); 
      listOfBilons.add(3, 5); 
      listOfBilons.add(4, 2); 
      listOfBilons.add(5, 1); 
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
