package com.olushola.school;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MargedOverLappedInterval {
    public static int[][] mergeOverlappingIntervals(int[][] intervals) {
        int [][] sortedIntervals = intervals.clone();

        Arrays.sort(sortedIntervals, Comparator.comparingInt(a -> a[0]));
        ArrayList<int []> storage = new ArrayList<int []>();
        storage.add(sortedIntervals[0]);
        int start = storage.get(0)[1];
        int prevIdx = 0;
        for(int i=1; i< sortedIntervals.length; i++){
            int[] currentInt = sortedIntervals[i];
            if (start < currentInt[0]){
                start = currentInt[1];
                storage.add(currentInt);
                prevIdx++;
            }
            else if (start >= currentInt[0]){
                start = Math.max(currentInt[0],currentInt[1]);
                int [] prevInt = storage.get(prevIdx);
                start = Math.max(start,prevInt[1]);
                prevInt[1] = start;
            }
        }
        return storage.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(mergeOverlappingIntervals(new int[][]{{1, 2},
                {3, 5},
                {4, 7},
                {6, 8},
                {9, 10},
                })));
    }
}
