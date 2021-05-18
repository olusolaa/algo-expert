package com.olushola.school;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BestTravel {

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {

        System.out.println("list="+ls +","+ "k=" + k);

        int bestSum = 0;

        if (ls.size() < k) return null;

        if(k == 1){
            for(int dist: ls){
                if(dist == t) return dist;
                if(dist > t) break;
                if (dist < t && dist > bestSum) bestSum = dist;
            }
        } else if(k==2){
            Collections.sort(ls);
            for(int p=0; p<ls.size()-1; p++){
                int j=p+1;
                while(j < ls.size()){
                    int sum = ls.get(p) + ls.get(j);
                    if(sum == t) return sum;
                    if (sum > bestSum) bestSum = sum;
                    j++;
                }
            }
        }else if(k == 3 ) {
            Collections.sort(ls);
            for (int p = 0; p < ls.size() - 2; p++) {
                int j = p + 1;
                int s = ls.size() - 1;
                while (j < s) {
                    int sum = ls.get(p) + ls.get(j) + ls.get(s);
                    if (sum == t) return sum;
                    if (sum < t && sum > bestSum) bestSum = sum;
                    if (sum < t) j++;
                    if (sum > t) s--;
                }
            }
        }
        return bestSum;
    }
    public static void main(String[] args) {
        List<Integer> ts = new ArrayList<>(Arrays.asList(50, 55, 56, 57, 58));
        System.out.println(chooseBestSum(163, 3, ts));
    }
}
