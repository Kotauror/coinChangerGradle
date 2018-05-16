import java.util.ArrayList;

public class App {

    public ArrayList<Integer> listOfCoins = new ArrayList<>();

    public int coinChanger(int number) {
        int num1 = decreaseByCoin(number, 50);
        int num2 = decreaseByCoin(num1, 20);
        int num3 = decreaseByCoin(num2, 10);
        int num4 = decreaseByCoin(num3, 5);
        int num5 = decreaseByCoin(num4, 2);
        int num6 = decreaseByCoin(num5, 1);
        return listOfCoins.size();
    }

    public int decreaseByCoin(int number, int coin) {
        while(number >= coin) {
            listOfCoins.add(coin);
            number -= coin;
        }
        return number;
    }
}
