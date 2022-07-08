package com.algorithms.bitwise;

public class SumOfTwoIntegers {

    public static void main(String[] args) {
        System.out.println(getSum(8, 12));
    }

    public static int getSum(int a, int b) {
        while(b != 0) {
            int carry = a & b;

            a = a ^ b;

            b = carry << 1;
        }

        return a;
    }
}
