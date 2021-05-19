package com.olushola.school;

import java.util.*;

public class FourNumberSum {
    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        ArrayList<Integer[]> list = new ArrayList<Integer[]>();
        HashMap<Integer, ArrayList<Integer []>> map = new HashMap<>();

        int pointer1 = 1;
        while(pointer1<array.length-1){
            int pointer2 = pointer1 + 1;
            while(pointer2<array.length){
                int sum = array[pointer1] + array[pointer2];
                int diff = targetSum - sum;
                if(map.containsKey(diff)) {

                    for (Integer[] item : map.get(diff)) {
                        list.add(new Integer[]{item[0], item[1], array[pointer1], array[pointer2]});
                    }
                }
                pointer2++;
            }
            pointer2 = 0;
            while(pointer2 < pointer1){
                Integer[] potentialPairs = {array[pointer1], array[pointer2]};
                int sum = array[pointer1] + array[pointer2];
                if(!map.containsKey(sum)) {
                    ArrayList<Integer[]> potentialPairsList = new ArrayList<>();
                    potentialPairsList.add(potentialPairs);
                    map.put(sum, potentialPairsList);
                }
                else{
                    map.get(sum).add(potentialPairs);
                }
                pointer2++;
            }
            pointer1++;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString((fourNumberSum( new int[]{5, -5, -2, 2, 3, -3}, 0)).toArray()));
    }
}
