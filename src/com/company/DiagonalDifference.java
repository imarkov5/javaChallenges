package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int sumOne = 0;
        int sumTwo = 0;
        int absDiff;
        for(int row = 0; row < arr.size(); row ++){
            sumOne += arr.get(row).get(row);
            sumTwo += arr.get(row).get(arr.size()-1-row);
        }
        absDiff = Math.abs(sumOne - sumTwo);
        return absDiff;
    }

    public static void main(String[] args) {
        List<List<Integer>> twoDim = new ArrayList<List<Integer>>();
        twoDim.add(Arrays.asList(112,42,83,119));
        twoDim.add(Arrays.asList(56,125,56,49));
        twoDim.add(Arrays.asList(15,78,101,43));
        twoDim.add(Arrays.asList(62,98,114,108));
        System.out.println(diagonalDifference(twoDim));
    }
}
