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
      while  (number > 0) {
          if (number >= 50 ) {
              System.out.println("number - 50");
              listOfCoins.add(50);
              number -= 50;
              System.out.println(listOfCoins);
              System.out.println(number);
          }
          while (number >= 20) {
              System.out.println("number - 20");
              listOfCoins.add(20);
              number -= 20;
              System.out.println(listOfCoins);
              System.out.println(number);
          }
          while (number >= 10) {
              System.out.println("number - 10");
              listOfCoins.add(10);
              number -= 10;
              System.out.println(listOfCoins);
              System.out.println(number);
          }

          while (number >= 5) {
              System.out.println("number - 5");
              listOfCoins.add(5);
              number -= 5;
              System.out.println(listOfCoins);
              System.out.println(number);
          }
      }
      return listOfCoins.size();
    }
}
