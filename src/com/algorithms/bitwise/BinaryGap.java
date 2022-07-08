package com.algorithms.bitwise;

public class BinaryGap {
    public static void main(String[] args) {
        int num = 1041;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(findLargestBinaryGap(num));
    }

    public static int findLargestBinaryGap(int number) {
        int pointer;
        for(pointer=1; pointer>0; pointer<<=1)
            if((number&pointer) != 0)
                break;

        int gapCount=0;
        int largestBinaryGap=0;

        for(; pointer>0; pointer<<=1) {
            if((number&pointer) != 0) {
                largestBinaryGap = gapCount < largestBinaryGap ? largestBinaryGap : gapCount;
                gapCount=-1;
            }
            gapCount++;
        }
        return largestBinaryGap;
    }
}
