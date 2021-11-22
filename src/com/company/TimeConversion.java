package com.company;

import java.sql.SQLOutput;

import static java.lang.Integer.parseInt;

public class TimeConversion {
    public static String timeConversion(String s) {
        String minSec = s.substring(2,8);
        int hours = Integer.parseInt(s.substring(0,2));
        String meridiemType = s.substring(8);
        String militaryTime;

        if (hours == 12){
            hours = 0;
        }
        if(meridiemType.equals("PM")) {
            hours += 12;
            militaryTime = Integer.toString(hours).concat(minSec);
            return militaryTime;
        }
        if(hours == 0){
            militaryTime = "00".concat(minSec);
            return militaryTime;
        }
        militaryTime = s.substring(0,8);
        return militaryTime;
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("12:01:00PM"));
        System.out.println(timeConversion("12:01:00AM"));
        System.out.println(timeConversion("05:25:45PM"));
        System.out.println(timeConversion("07:01:00AM"));
    }
}
