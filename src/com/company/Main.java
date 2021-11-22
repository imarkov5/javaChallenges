package com.company;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Main {


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

    public static List<Integer> countingSort(List<Integer> arr) {

        System.out.println("array " + arr);
        List<Integer> frequencyArr = Arrays.stream(new int[100]).boxed().collect(Collectors.toList());
        System.out.println("frequency array original" + frequencyArr);
        for (int i = 0; i < arr.size(); i++) {
            int value = frequencyArr.get(arr.get(i)) + 1;

            frequencyArr.set(arr.get(i), value);
        }

        return frequencyArr;

    }

    public static int flippingMatrix(List<List<Integer>> matrix) {

        int max = 0;

        int leftUpperZero = matrix.get(0).get(0);
        int leftLowerZero = 0;
        int rightUpperZero = matrix.get(0).get(matrix.size()-1);;
        int rightLowerZero = 0;

        int leftUpperOne = matrix.get(0).get(1);
        int leftLowerOne = 0;
        int rightUpperOne = matrix.get(0).get(matrix.size()-2);;
        int rightLowerOne = 0;

        int leftUpperTwo = matrix.get(1).get(0);
        int leftLowerTwo = 0;
        int rightUpperTwo = matrix.get(1).get(matrix.size()-1);
        int rightLowerTwo = 0;

        int leftUpperThree = matrix.get(1).get(1);
        int leftLowerThree = 0;
        int rightUpperThree = matrix.get(1).get(matrix.size()-2);
        int rightLowerThree = 0;

        for (List row: matrix) {
            leftLowerZero = matrix.get(row.size() - 1).get(0);
            rightLowerZero = matrix.get(row.size() - 1).get(matrix.size() - 1);

            leftLowerOne = matrix.get(row.size() - 1).get(1);
            rightLowerOne = matrix.get(row.size() - 1).get(matrix.size() - 2);

            leftLowerTwo = matrix.get(row.size() - 2).get(0);
            rightLowerTwo = matrix.get(row.size() - 2).get(matrix.size() - 1);

            leftLowerThree = matrix.get(row.size() - 2).get(1);
            rightLowerThree = matrix.get(row.size() - 2).get(matrix.size() - 2);
        }

        ArrayList<Integer> zero = new ArrayList<>();
        zero.add(leftLowerZero);
        zero.add(leftUpperZero);
        zero.add(rightLowerZero);
        zero.add(rightUpperZero);
        int maxZero = Collections.max(zero);
        ArrayList<Integer> one = new ArrayList<>();
        one.add(leftLowerOne);
        one.add(leftUpperOne);
        one.add(rightLowerOne);
        one.add(rightUpperOne);
        int maxOne = Collections.max(one);
        ArrayList<Integer> two = new ArrayList<>();
        two.add(leftLowerTwo);
        two.add(leftUpperTwo);
        two.add(rightLowerTwo);
        two.add(rightUpperTwo);
        int maxTwo = Collections.max(two);
        ArrayList<Integer> three = new ArrayList<>();
        three.add(leftLowerThree);
        three.add(leftUpperThree);
        three.add(rightLowerThree);
        three.add(rightUpperThree);
        int maxThree = Collections.max(three);

        max = maxZero + maxOne + maxTwo + maxThree;
        return max;


    }

    public static int mergeFiles(List<Integer> fileSizes){
        int pair = 0;
        int sum = 0;
        Collections.sort(fileSizes);
        System.out.println(fileSizes);
        while (fileSizes.size()>=2) {
            pair = fileSizes.get(0) + fileSizes.get(1);
            fileSizes.remove(0);
            fileSizes.remove(0);
            fileSizes.add(pair);
            Collections.sort(fileSizes);
            System.out.println(pair);
            sum += pair;
        }
        return sum;
    }
    public static List<List<Integer>> optimalFlight(List<List<Integer>> returnFlight, List<List<Integer>> forwardFlight, int distance){
        List<List<Integer>> indexList = new ArrayList<List<Integer>>();

        return indexList;
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

    }
}
