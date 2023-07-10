package com.bridgelabz;


public class LinkedListMain{
    public static void main(String[] args) {
       LinkedListFunctions list=new LinkedListFunctions();
        list.addFirst(56);
        list.addLast(30);
        list.addLast(70);
        System.out.println("Elements in the list are :");
        list.printList();
    }
}