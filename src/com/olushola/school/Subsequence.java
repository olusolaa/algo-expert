package com.olushola.school;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        int count = 0;
        for (int j=0; j<array.size(); j++) {
            for (int i = count; i < sequence.size(); i++) {
                if (array.get(j) == sequence.get(i)) {
                    count++;
                    break;
                }

            }
        }
        return count==sequence.size();
    }

    public static void main(String[] args) {
        List array = List.of(5, 1, 22, 25, 6, -1, 8, 10);
        List sequence = List.of(1, 6, 6, -1, 10);
        System.out.println(isValidSubsequence(array,sequence));
    }
}
