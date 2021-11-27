package com.company;

import java.util.*;
import java.util.stream.Collector;

public class Pangrams {
    public static String pangrams(String s) {
        // Write your code here
        List<Character> charList = new ArrayList<>();
        String result = "";
        s = s.replaceAll("\\s", "");
        s = s.toLowerCase(Locale.ROOT);

        for (char c : s.toCharArray()) {
            if(Character.isDigit(c)){
                continue;
            }
            charList.add(c);
        }
        Collections.sort(charList);
        for (int i = 0; i < charList.size()-1; i++) {
            if(charList.get(i).equals(charList.get(i+1))){
                charList.remove(i);
                i--;
            }
        }
        System.out.println(charList);
        if(charList.size() < 26){
            return result.concat("not pangram");
        }
        return result.concat("pangram");

    }

    public static void main(String[] args) {
//        String s = "We promptly judged antique ivory buckles for the next prize111";
//        String s = "We promptly judged antique ivory buckles for the prize";
        String s = "YaCoVaGAaXxrzUvZ ZaHyacbUZCZUbZxzAYb YefxAwV yyABAdVatYazC TuyYYedxSf aA XBvSg EvYcl badDxvaZXWCyCUAaZvJcyc YdVbDYAdObgc FeCyxpdXxffubDbGAbFBxnzzT WzZ WcBZAaYCgYzseZb PYXbswxchtYIedhyaXtvzVxZSwWBLxxEaAaYAfGzybZzQo AH tCBcszyXZaAgwzYB QdVZBvwzAYbwwAVysxCRdTTT bXzxtWwyXZebEBYNBaDCLbZbwsEAB YTFBAcD bybU axAZAhhay ZkWydfxyGAeAYaZlabazUZssGTBcCXBr dWs XzyZAEzAAZyclC bCGzPfXcCccAFyvazX ZzYAB zAbsuCZADkeWwUuAbaZ zWCtYzgZZBzXXD c VsrbEaG aYYFZJBUlW iXqZxxswaWTJvb Y xuwebj CF zyZYZVdYYdaRyZ bTatyzYZw wVfaZEZauyZ A yo afJeCBAyVDXWBbAxYBzYyiNuWxBbexEcbeVaAqYz XAjawBzEqDzaafz bTaUaAzWYBxXWZzbazbUwYhqCdV DdzyWafztJajczbt CtYVVfzBgdtvXEGyBxy bdZz C xtczZ SZVfW ZCAx aZYDaa cCyZuVUEBGZ ACbawWXdxxLXa EawAgzOABYFbzTf TszVYaDc fACydzZYdAazSaaygBAYbGzdz yyYBYa Vasay xAz A AVWeYXY aTdYCcZIVxxHcWazZyaWaeYZybYUVZ Bu zXwgACWwzXzBaCwAVddb YB aYBBoGXUAcBZPbzVUGtX DeVduXZGXXtOBwagbXZAcDZIDZvTzA yyuUb AZ";
        System.out.println(pangrams(s));
    }
}
