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

    @BeforeEach 
    public void initObject() {
        app = new App();
    }

    @Test
    public void change50() {
        ArrayList<Integer> afterOperation = app.changeCoins(50, 0);
        ArrayList<Integer> expectedOutput = new ArrayList<>();
        Collections.addAll(expectedOutput, 50);
        assertTrue(afterOperation.equals(expectedOutput));
    }

    @Test
    public void change20() {
        ArrayList<Integer> afterOperation = app.changeCoins(20, 0);
        ArrayList<Integer> expectedOutput = new ArrayList<>();
        Collections.addAll(expectedOutput, 20);
        assertTrue(afterOperation.equals(expectedOutput));
    }

    @Test
    public void change73() {
        ArrayList<Integer> afterOperation = app.changeCoins(73, 0);
        ArrayList<Integer> expectedOutput = new ArrayList<>();
        Collections.addAll(expectedOutput, 50, 20, 3, 1);
        assertTrue(afterOperation.equals(expectedOutput));
    }

    @Test 
    public void change53() {
        ArrayList<Integer> afterOperation = app.changeCoins(53, 0);
        ArrayList<Integer> expectedOutput = new ArrayList<>();
        Collections.addAll(expectedOutput, 50, 2, 1);
        assertTrue(afterOperation.equals(expectedOutput));
    }
}
