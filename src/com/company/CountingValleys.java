package com.company;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        int valleys = 0;
        int seaLevel = 0;

        for(char c : path.toCharArray()){
            if(c == 'U'){
                seaLevel ++;
                if(seaLevel == 0){
                    valleys++;
                }
            }else{
                seaLevel --;
            }
        }

        return valleys;
    }

    public static void main(String[] args) {
        int steps = 8;
        String path = "UDDDUDUU";
        System.out.println(countingValleys(steps,path));
    }
}
