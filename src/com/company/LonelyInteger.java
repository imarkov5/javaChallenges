package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        int lonelyInt = 0;

        for (Integer num: a) {
            if(Collections.frequency(a, num) == 1){
                lonelyInt = num;
            }
        }

        return lonelyInt;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(7);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        System.out.println(lonelyinteger(arr));
    }

}
