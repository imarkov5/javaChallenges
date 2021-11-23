package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ComparisonSorting {
    public static List<Integer> countingSort(List<Integer> arr) {
        int max = Collections.max(arr) + 1;
        List<Integer> frequencyArr = Arrays.stream(new int[max]).boxed().collect(Collectors.toList()); //boxed() returns a Stream consisting of the elements of this stream, each boxed to an Integer.
        for(int i = 0; i < arr.size(); i++) {
            int value = frequencyArr.get(arr.get(i)) + 1;
            frequencyArr.set(arr.get(i), value);
            }


        return frequencyArr;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        System.out.println(countingSort(arr));
    }
}
