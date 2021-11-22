package com.company;

import java.util.Locale;
import java.util.Scanner;

public class CamelCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String output = "";
            String modified = line.substring(4);
            char charArr[] = modified.toCharArray();
            int count = 0;
            int length = modified.length();
            int ind = 0;

            if(line.substring(0,1).equals("C") && line.substring(2,3).equals("C")){
                charArr[0] = Character.toUpperCase(charArr[0]);
                for(int i = 0; i < charArr.length; i++){
                    if(charArr[i] == ' '){
                        count ++;
                        charArr[i+1] = Character.toUpperCase(charArr[i+1]);
                    }else{
                        charArr[ind++] = charArr[i];
                    }
                }
                output = String.valueOf(charArr,0,length - count);
            }
            if(line.substring(0,1).equals("C") && line.substring(2,3).equals("V")){
                charArr[0] = Character.toLowerCase(charArr[0]);
                for(int i = 0; i < charArr.length; i++){
                    if(charArr[i] == ' '){
                        count ++;
                        charArr[i+1] = Character.toUpperCase(charArr[i+1]);
                    }else{
                        charArr[ind++] = charArr[i];
                    }
                }
                output = String.valueOf(charArr,0,length - count);
            }
            if(line.substring(0,1).equals("C") && line.substring(2,3).equals("M")){
                charArr[0] = Character.toLowerCase(charArr[0]);
                for(int i = 0; i < charArr.length; i++){
                    if(charArr[i] == ' '){
                        count ++;
                        charArr[i+1] = Character.toUpperCase(charArr[i+1]);
                    }else{
                        charArr[ind++] = charArr[i];
                    }
                }
                output = output.concat(String.valueOf(charArr,0,length - count)).concat("()");
            }
            if(line.substring(0,1).equals("S")){
                for(int i = 0; i < modified.length(); i ++){
                    if(modified.substring(i, i+1).matches("[A-Z]") && i != 0){
                        output = output.concat(" ").concat(modified.substring(i, i+1));
                    }else{
                        output = output.concat(modified.substring(i, i+1));
                    }
                }
                output = output.toLowerCase(Locale.ROOT);
                if(line.substring(2,3).equals("M")){
                    output = output.substring(0,output.length()-2);
                }

            }
            System.out.println(output);
        }
    }

}
