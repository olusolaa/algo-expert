package com.olushola.school;

import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDuplicatesFromLinked {

    public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
        this.value = value;
        this.next = null;
    }
}
//    public static LinkedList add(Integer value){
////        while()
//    }
    public static LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        HashSet<Integer> seen = new HashSet<>();
        while(linkedList.next != null){
            seen.add(linkedList.value);
            if(seen.contains(linkedList.next.value)) {
                linkedList.next = linkedList.next.next;
            }
        }
        return linkedList;
    }

    public static void main(String[] args) {
        java.util.LinkedList list = new java.util.LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
//        System.out.println(removeDuplicatesFromLinkedList(list));
    }
}
