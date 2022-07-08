package com.algorithms.arrayshash;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> existentNumbers = new HashSet<>();

        for(int number : nums) {
            if (existentNumbers.contains(number))
                return true;

            existentNumbers.add(number);
        }

        return false;
    }
}
