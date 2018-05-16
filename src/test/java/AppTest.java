/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class AppTest {

    public App tester;

    @Before public void initObject() {
        tester = new App();
    }

    @Test public void returnsNumberOfCoins50() {
        assertEquals("case for 50", 1, tester.coinChanger(50));
    }
    @Test public void returnsNumberOfCoins50_20() {
        assertEquals("case for 70", 2, tester.coinChanger(70));
    }
    @Test public void returnsNumberOfCoins20_20() {
        assertEquals("case for 40", 2, tester.coinChanger(40));
    }
    @Test public void returnsNumberOfCoins20_10() {
        assertEquals("case for 30", 2, tester.coinChanger(30));
    }
    @Test public void returnsNumberOfCoins50_20_10_5() {
        assertEquals("case for 95", 4, tester.coinChanger(95));
    }
    @Test public void returnsNumberOfCoins50_20_10_5_2() {
        assertEquals("case for 97", 5, tester.coinChanger(97));
    }
    @Test public void returnsNumberOfCoins50_20_10_5_2_1() {
        assertEquals("case for 98", 6, tester.coinChanger(98));
    }
}
