package com.olushola.school;

import java.util.Arrays;
import java.util.Hashtable;

public class LargestRange {
    public static int[] largestRange(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array) );
        int[] store = new int[2];
        int maxRange = 0;
        int start = 0;
        int range =0;
        for(int i=0; i<array.length; i++) {
            if(array[start]== array[i]) {
                range = 1;
            }else{
                range = i + 1 - start;
            }
            if (i == array.length - 1) {
                if (maxRange < range) {
                    store = new int[]{array[start], array[i]};
                }
            } else if (array[i+1] - array[i] > 1) {
                if (maxRange <= range) {
                    if (start != array[i]){
                        store = new int[]{array[start], array[i]};
                    }
                    maxRange = range;
                    start = i + 1;
                }
            }
        }
        return store;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(largestRange(new int[]{0, 9, 19, -1, 18, 17, 2, 10, 3, 12, 5, 16, 4, 11, 8, 7, 6, 15, 12, 12, 2, 1, 6, 13, 14})));
    }
}
