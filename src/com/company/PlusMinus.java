package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        System.out.println(arr);
        BigDecimal positive = new BigDecimal("0");
        BigDecimal negative = new BigDecimal("0");
        BigDecimal zero = new BigDecimal("0");

        for(int i = 0; i < arr.size(); i ++){
            if(arr.get(i) > 0){
                positive = positive.add(BigDecimal.ONE);
            }else if(arr.get(i) < 0){
                negative = negative.add(BigDecimal.ONE);
            }else{
                zero = zero.add(BigDecimal.ONE);
            }
        }
        System.out.println(positive.divide(BigDecimal.valueOf(arr.size()), 6, RoundingMode.CEILING));
        System.out.println(negative.divide(BigDecimal.valueOf(arr.size()), 6, RoundingMode.CEILING));
        System.out.println((zero.divide(BigDecimal.valueOf(arr.size()),6,RoundingMode.CEILING)));

    }
    public static void main(String[] args) {
        List<List<Integer>> twoDim = new ArrayList<List<Integer>>();
        twoDim.add(Arrays.asList(112,42,83,119));
        twoDim.add(Arrays.asList(56,125,56,49));
        twoDim.add(Arrays.asList(15,78,101,43));
        twoDim.add(Arrays.asList(62,98,114,108));
//        System.out.println(diagonalDifference(twoDim));

        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(-1);
        arr.add(-1);
//        arr.add(2);
//        arr.add(5);
//        arr.add(5);

//        System.out.println("frequency array" + countingSort(arr));

//        System.out.println(flippingMatrix(twoDim));

//        System.out.println(mergeFiles(arr));
        plusMinus(arr);
    }
}
