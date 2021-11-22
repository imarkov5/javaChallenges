package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class BreakingRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> minMax = new ArrayList<>();
        int base = scores.get(0);
        int min = scores.get(0);
        int max = scores.get(0);
        int minCount = 0;
        int maxCount = 0;
        for(int i = 1; i < scores.size(); i ++){
            if(scores.get(i) > base && scores.get(i) > max) {
                System.out.println(scores.get(i) + " > " + base + " and " + scores.get(i) + " > "+ maxCount);
                max = scores.get(i);
                System.out.println(max);
                maxCount++;
                System.out.println(maxCount);
            }else if (scores.get(i) < base && scores.get(i) < min){
                min = scores.get(i);
                minCount ++;
            }
        }
        minMax.add(minCount);
        minMax.add(maxCount);
        return minMax;
    }

    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();

        scores.add(12);
        scores.add(24);
        scores.add(10);
        scores.add(24);

        System.out.println(breakingRecords(scores));
    }
}
