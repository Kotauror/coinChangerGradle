package com.example.coding;

import java.util.ArrayList;
import java.util.Collections;
import com.example.coding.CoinChanger;
import java.io.*;

public class App {

      public static void main(String[] args) {
        CoinChanger coinChanger = new CoinChanger();
         int[] finalCoinsOfUser = coinChanger.changeCoins(73, 0);
          for (Integer coin : finalCoinsOfUser) {
            System.out.println(coin);    
          }
      }
}
