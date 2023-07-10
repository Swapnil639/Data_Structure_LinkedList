package com.bridgelabz;


public class LinkedListMain{
    public static void main(String[] args) {
       LinkedListFunctions list=new LinkedListFunctions();
        list.addFirst(56);
        list.addFirst(30);
        list.addFirst(70);
        System.out.println("Elements in the list are :");
        list.printList();
    }
}