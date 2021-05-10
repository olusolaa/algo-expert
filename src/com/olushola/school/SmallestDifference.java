package com.olushola.school;

import java.util.Arrays;

public class SmallestDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int pointer1 = 0;
        int pointer2 = 0;
        int minDifference = Integer.MAX_VALUE;
        int [] result = new int [] {};
        while(pointer1 < arrayOne.length ){
            int difference = Math.abs(arrayOne[pointer1] - arrayTwo[pointer2]);
            if(arrayOne[pointer1] == arrayTwo[pointer2]){
                return new int [] {arrayOne[pointer1], arrayTwo[pointer2]};
            }
            if(difference < minDifference){
                result = new int [] {arrayOne[pointer1], arrayTwo[pointer2]};
                minDifference = difference;
            }
            if(arrayOne[pointer1] < arrayTwo[pointer2]){
                pointer1++;
            }
            else if(arrayOne[pointer1] > arrayTwo[pointer2]){
                pointer2++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(smallestDifference( new int [] {10, 0, 20, 25} ,
        new int[] {1005, 1006, 1014, 1032, 1031})[0]);
        System.out.println(smallestDifference( new int [] {10, 0, 20, 25} ,
                new int[] {25, 1006, 1014, 1032, 1031})[1]);
    }
}
