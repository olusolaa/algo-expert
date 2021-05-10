package com.olushola.school;

import java.util.Arrays;

public class NonConstructibleChange {
    public static int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        if(coins[0] > 1) return 1;

        int cumulativeSum=0;
        for(int coin : coins){
            if(coin> cumulativeSum+1 ) return cumulativeSum+1;
            cumulativeSum = cumulativeSum + coin;
    }
        return -1;
}

    public static void main(String[] args) {
        System.out.println(nonConstructibleChange(new int[]{5, 7, 1, 1, 2, 3, 22}));
    }
}
