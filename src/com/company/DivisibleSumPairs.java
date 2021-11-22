package com.company;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int result = 0;
        for(int i = 0; i < ar.size()-1; i ++){
            for(int j = i+1; j < ar.size(); j ++){
                System.out.println(ar.get(i) + " " + ar.get(j));

                if((ar.get(i) + ar.get(j)) % k == 0){
                    System.out.println(ar.get(i) + " + " + ar.get(j));
                    result ++;
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(6);
        arr.add(1);
        arr.add(2);

        System.out.println(divisibleSumPairs(6,3,arr));

    }
}
