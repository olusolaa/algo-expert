package com.olushola.school;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        List<Integer[]> list = new ArrayList();
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            int leftPointer = i+1;
            int rightPointer = array.length - 1;
            while(rightPointer > leftPointer){
                System.out.println(rightPointer + " " + leftPointer);
                int sum = array[i] + array[leftPointer] + array[rightPointer];
                if(sum == targetSum) {
                    list.add(new Integer[]{array[i], array[leftPointer], array[rightPointer]});
                    rightPointer--;
                    leftPointer++;
                }
                else if(sum > targetSum) rightPointer--;
                else if(sum < targetSum) leftPointer++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(threeNumberSum(new int[] {12, 3, 1, 2, -6, 5, -8, 6}, 0));
    }
}
