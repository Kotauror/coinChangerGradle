import java.util.ArrayList;

public class App {

    public ArrayList<Integer> listOfCoins = new ArrayList<>();

    public int coinChanger(int number) {
        int num1 = singleLoop(number, 50);
        int num2 = singleLoop(num1, 20);
        int num3 = singleLoop(num2, 10);
        int num4 = singleLoop(num3, 5);
        int num5 = singleLoop(num4, 2);
        int num6 = singleLoop(num5, 1);
        return listOfCoins.size();
    }

    public int singleLoop(int number, int coin) {
        while(number >= coin) {
            listOfCoins.add(coin);
            number -= coin;
        };
        return number;
    }
}
