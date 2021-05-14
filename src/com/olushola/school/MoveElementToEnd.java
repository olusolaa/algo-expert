package com.olushola.school;

import java.util.*;

public class MoveElementToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int pointer1 = 0;
        int pointer2 = array.size()-1;
        if(pointer2 < 0) return array;
        while(pointer1 <= pointer2){
            if(array.get(pointer1) != toMove){
                pointer1++;
            }
            else if (array.get(pointer1) == toMove && array.get(pointer2) != toMove ){
                int temp = array.get(pointer1);
                array.set(pointer1, array.get(pointer2));
                array.set(pointer2, temp);
                pointer1++;
                pointer2--;
            }
            else if(array.get(pointer1) == toMove && array.get(pointer2) == toMove ){
                pointer2--;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.asList( moveElementToEnd(Arrays.asList(2, 4, 2, 3, 6, 2, 2), 2)));
    }
}
