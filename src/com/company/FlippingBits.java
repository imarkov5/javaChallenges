package com.company;

public class FlippingBits {
    public static long flippingBits(long n) {
        // Write your code here
        String binaryString = Long.toBinaryString(n);
        binaryString = String.format("%32s", binaryString).replaceAll(" ", "0");
        String convertedBinaryString = binaryString.replaceAll("0", "2");
        convertedBinaryString = convertedBinaryString.replaceAll("1", "0");
        convertedBinaryString = convertedBinaryString.replaceAll("2", "1");

        Long result = Long.parseUnsignedLong(convertedBinaryString, 2);


        return result;
    }

    public static void main(String[] args) {
        long n = 0;
        System.out.println(flippingBits(n));
    }
}
