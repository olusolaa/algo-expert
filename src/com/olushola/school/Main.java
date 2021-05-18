package com.olushola.school;

import java.util.Arrays;

public class Main {

    public static int[] twoNumberSum(int[] array, int targetSum) {

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] != array[j]){
                    int sum = array[i] + array[j];
                    if (sum == targetSum) return new int[]{array[i], array[j]};
                }
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int [] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        System.out.println(Arrays.toString(twoNumberSum(array,targetSum)));
    }
}
