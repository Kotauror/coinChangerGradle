package com.example.coding;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Logger;

public class CoinChangerTest {

    public CoinChanger coinChanger;

    private static Logger log = Logger.getLogger("jusia");

    @BeforeEach 
    public void initObject() {
        coinChanger = new CoinChanger();
    }

    @Test
    public void change50() {
        int[] afterOperation = coinChanger.changeCoins(50, 0);
        int[] expectedOutput = {50};

        assertTrue(afterOperation.equals(expectedOutput));
    }

    @Test
    public void change20() {
        int[] afterOperation = coinChanger.changeCoins(20, 0);
        int[] expectedOutput = {20};

        assertTrue(afterOperation.equals(expectedOutput));
    }

    @Test
    public void change73() {
        int[] afterOperation = coinChanger.changeCoins(73, 0);
        int[] expectedOutput = {50, 20, 3, 1};

        assertTrue(afterOperation.equals(expectedOutput));
    }

    @Test 
    public void change53() {
        int[] afterOperation = coinChanger.changeCoins(53, 0);
        int[] expectedOutput = {50, 2, 1};

        assertTrue(afterOperation.equals(expectedOutput));
    }
}
