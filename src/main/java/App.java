/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import java.util.ArrayList;
public class App {
    // public String getGreeting() {
    //     return "Hello world.";
    // }
    //
    // public static void main(String[] args) {
    //     System.out.println(new App().getGreeting());
    // }

    public int coinChanger(int number) {
      ArrayList<Integer> listOfCoins = new ArrayList<>();
          if (number >= 50 ) {
              listOfCoins.add(50);
              number -= 50;
          }
          while (number >= 20) {
              listOfCoins.add(20);
              number -= 20;
          }
          while (number >= 10) {
              listOfCoins.add(10);
              number -= 10;
          }
          while (number >= 5) {
              listOfCoins.add(5);
              number -= 5;
          }
          while (number >= 2) {
              listOfCoins.add(2);
              number -= 2;
          }
          while (number >= 1) {
              listOfCoins.add(1);
              number -= 1;
          }
      return listOfCoins.size();
    }
}
