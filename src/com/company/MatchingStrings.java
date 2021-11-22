package com.company;

import java.util.ArrayList;
import java.util.List;

public class MatchingStrings {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        int count = 0;
        for (String q: queries){
            for (String str: strings) {
//                System.out.println(q + " & " + str);
                if(q.equals(str)){
//                    System.out.println(q + " = " + str);
                    count ++;
                }
            }result.add(count);
            count = 0;
        }

        return result;

    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("aba");
        strings.add("baba");
        strings.add("aba");
        strings.add("xzxb");

        List<String> queries = new ArrayList<>();
        queries.add("aba");
        queries.add("xzxb");
        queries.add("ab");
        System.out.println(matchingStrings(strings,queries));
    }
}
