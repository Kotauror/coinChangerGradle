import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Logger;

public class AppTest {

    public App tester;

    private static Logger log = Logger.getLogger("jusia");

    // private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach public void initObject() {
        tester = new App();
       //  System.setOut(new PrintStream(outContent));
    }
    @Test public void decreaseByCoin_50() {
      assertEquals(0, tester.decreaseByACoin(50, 50), "case for 50");
    }
    @Test public void decreaseByCoin_40() {
      assertEquals(0, tester.decreaseByACoin(40, 20), "case for 40");
    }
    @Test public void decreaseByCoin_30() {
      assertEquals(10, tester.decreaseByACoin(30, 20));
    }
    @Test public void decreaseByCoin_14() {
      assertEquals(4, tester.decreaseByACoin(14, 5));
    }
    @Test public void returnsArrayOfCoins50() {
        ArrayList<Integer> afterOperation = tester.coinChanger(50, 0);
        ArrayList<Integer> expectedOutput = new ArrayList<>();
        Collections.addAll(expectedOutput, 50);
        assertTrue(afterOperation.equals(expectedOutput));
    }
    @Test public void returnsArrayOfCoins20() {
        ArrayList<Integer> aftOpTwo = tester.coinChanger(20, 0);
        ArrayList<Integer> expectedOutputTwo = new ArrayList<>();
        Collections.addAll(expectedOutputTwo, 20);
        assertTrue(aftOpTwo.equals(expectedOutputTwo));
    }
    @Test public void returnsArrayOfCoins73() {
        ArrayList<Integer> aftOpTwo = tester.coinChanger(73, 0);
        ArrayList<Integer> expectedOutputTwo = new ArrayList<>();
        Collections.addAll(expectedOutputTwo, 50, 20, 3, 1);
        assertTrue(aftOpTwo.equals(expectedOutputTwo));
    }
    @Test public void returnsArrayOfCoins53() {
        ArrayList<Integer> aftOpTwo = tester.coinChanger(53, 0);
        ArrayList<Integer> expectedOutputTwo = new ArrayList<>();
        Collections.addAll(expectedOutputTwo, 50, 2, 1);
        assertTrue(aftOpTwo.equals(expectedOutputTwo));
    }
}
