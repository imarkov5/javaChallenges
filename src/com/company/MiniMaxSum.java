package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.LongAccumulator;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        Long max = Collections.max(arr).longValue();
        Long min = Collections.min(arr).longValue();
        Long sum = 0L;


        for (Integer num: arr) {
            sum += num;
        }


        System.out.print((sum - max) + " " + (sum - min));
    }

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);
        miniMaxSum(arr);

    }

}

