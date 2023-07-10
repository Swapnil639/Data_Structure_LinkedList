package com.bridgelabz;


public class LinkedListMain{
    public static void main(String[] args) {
       LinkedListFunctions list=new LinkedListFunctions();
        list.addElementAtFirst(70);
        list.addElementAtFirst(30);
        list.addElementAtFirst(56);
        list.printList();
        LinkedListFunctions linkedList1 = new LinkedListFunctions();
        linkedList1.addElementAtFirst(56);
        linkedList1.addElementAtLast(30);
        linkedList1.addElementAtLast(70);
        linkedList1.printList();
        linkedList1.insertElementAtPosition(2,5);
        linkedList1.printList();
    }
}