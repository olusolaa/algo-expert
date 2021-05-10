package com.olushola.school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountingChanges {

    public static int countChange(int money, List<Integer> coins){
        if(money<0 || coins.size() == 0){
            return 0;
        }else if(money ==0){
            return 1;
        }
        return countChange(money-coins.get(0), coins) + countChange(money, coins.subList(1,coins.size()));
    }
    public static void main(String[] args) {
        System.out.println(countChange(10, List.of(5,2,3)));
    }
}
