package com.olushola.school;

public class LongestPeak {

    public static int longestPeak(int[] array) {
        int longestPeak = 0;
        int pointer = 1;
        while(pointer < array.length-1){
            if(array[pointer - 1] < array[pointer] && array[pointer] > array[pointer+1]){
                int leftidx = pointer - 2;
                int rightidx = pointer + 2;
                while(leftidx >= 0 && array[leftidx] < array[leftidx+1] ){
                    leftidx--;
                }
                while(rightidx <= array.length-1 && array[rightidx] < array[rightidx-1] ){
                    rightidx++;
                }
                int peakLength = rightidx - leftidx -1;
                if(peakLength > longestPeak){
                    longestPeak = peakLength;
                }
                pointer = rightidx;
            }else pointer++;
        }
        return longestPeak;
    }
}

