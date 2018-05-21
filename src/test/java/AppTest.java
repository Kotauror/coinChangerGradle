import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Logger;

public class AppTest {

    public App app;

    private static Logger log = Logger.getLogger("jusia");

    @BeforeEach public void initObject() {
        app = new App();
    }
    @Test public void returnsArrayOfCoins50() {
        ArrayList<Integer> afterOperation = app.coinChanger(50, 0);
        ArrayList<Integer> expectedOutput = new ArrayList<>();
        Collections.addAll(expectedOutput, 50);
        assertTrue(afterOperation.equals(expectedOutput));
    }
    @Test public void returnsArrayOfCoins20() {
        ArrayList<Integer> aftOpTwo = app.coinChanger(20, 0);
        ArrayList<Integer> expectedOutputTwo = new ArrayList<>();
        Collections.addAll(expectedOutputTwo, 20);
        assertTrue(aftOpTwo.equals(expectedOutputTwo));
    }
    @Test public void returnsArrayOfCoins73() {
        ArrayList<Integer> aftOpTwo = app.coinChanger(73, 0);
        ArrayList<Integer> expectedOutputTwo = new ArrayList<>();
        Collections.addAll(expectedOutputTwo, 50, 20, 3, 1);
        assertTrue(aftOpTwo.equals(expectedOutputTwo));
    }
    @Test public void returnsArrayOfCoins53() {
        ArrayList<Integer> aftOpTwo = app.coinChanger(53, 0);
        ArrayList<Integer> expectedOutputTwo = new ArrayList<>();
        Collections.addAll(expectedOutputTwo, 50, 2, 1);
        assertTrue(aftOpTwo.equals(expectedOutputTwo));
    }
}
