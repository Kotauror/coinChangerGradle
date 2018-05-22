package com.example.coding;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CoinChangerTest {

    public CoinChanger coinChanger;

    @BeforeEach 
    public void initObject() {
        coinChanger = new CoinChanger();
    }

    @Test
    public void change50() {
        int[] afterOperation = coinChanger.changeCoins(50);
        int[] expectedOutput = {50};

        assertTrue(afterOperation.equals(expectedOutput));
    }

    @Test
    public void change20() {
        int[] afterOperation = coinChanger.changeCoins(20);
        int[] expectedOutput = {20};

        assertTrue(afterOperation.equals(expectedOutput));
    }

    @Test
    public void change73() {
        int[] afterOperation = coinChanger.changeCoins(73);
        int[] expectedOutput = {50, 20, 3, 1};

        assertTrue(afterOperation.equals(expectedOutput));
    }

    @Test 
    public void change53() {
        int[] afterOperation = coinChanger.changeCoins(53);
        int[] expectedOutput = {50, 2, 1};

        assertTrue(afterOperation.equals(expectedOutput));
    }
}
