package com.bridgelabz;


public class LinkedListMain {
    public static void main(String[] args) {
        LinkedListFunctions list = new LinkedListFunctions();
        list.addElementAtFirst(70);
        list.addElementAtFirst(30);
        list.addElementAtFirst(56);
        list.printList();

        LinkedListFunctions linkedList1 = new LinkedListFunctions();
        linkedList1.addElementAtFirst(56);
        linkedList1.addElementAtLast(30);
        linkedList1.addElementAtLast(70);
        linkedList1.printList();

        linkedList1.insertElementAtPosition(2, 5);
        linkedList1.printList();

        linkedList1.firstElementDelete();
        linkedList1.printList();

        linkedList1.lastElementDelete();
        linkedList1.printList();

        if ( linkedList1.search(30) == null){
            System.out.println("Element Absent in Linked list");
        }else {
            System.out.println("Element Present in Linked list");
        }

        linkedList1.insertElementAfterAnyKey(5,78);
        linkedList1.printList();

        linkedList1.searchElementThenDelete(5);
        linkedList1.printList();




    }
}