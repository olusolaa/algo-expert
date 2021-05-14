package com.olushola.school;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralTrasverse {
    public static List<Integer> spiralTraverse(int[][] array) {

        int startCol = 0;
        int endColumn = array[0].length-1;
        int startRow = 0;
        int endRow = array.length-1;
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (startCol <= endColumn && startRow <= endRow){
            for(int i = startCol; i<=endColumn; i++){
                list.add(array[startRow][i]);
            }
            startRow++;
            for (int i = startRow ; i<=endRow; i++) {
                list.add(array[i][endColumn]);
            }
            endColumn--;
            for (int i = endColumn; i>=startCol; i--) {
                if(endRow <startRow) break;
                list.add(array[endRow][i]);
            }
            endRow--;
            for (int i = endRow; i>=startRow; i--) {
                if(endColumn < startCol) break;
                list.add(array[i][startCol]);
            }
            startCol++;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(spiralTraverse(new int[][] {{1}, {12}, {11}, {3}, {5}, {6}, {7}}));
    }
}
