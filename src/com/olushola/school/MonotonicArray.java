package com.olushola.school;

public class MonotonicArray {
    public static boolean isMonotonic(int[] array) {
        int pointer1 = 0;
        int pointer2 = 1;
        while(pointer2 <array.length){
            if(array[pointer1] >= array[pointer2]){
                return true;
            }
            pointer1++;
            pointer2++;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isMonotonic( new int[] {-1, -5, -10, -1100, -1100, -1101, -1102, -9001}));
    }
}
