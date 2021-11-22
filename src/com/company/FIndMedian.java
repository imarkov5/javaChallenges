package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FIndMedian {
    public static int findMedian(List<Integer> arr) {
        // Write your code here

        int median = 0;
        int medianIndex = arr.size()/2;
        Collections.sort(arr);

        median = arr.get(medianIndex);
        return median;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(5);
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(2);

        System.out.println(findMedian(arr));
    }
}
