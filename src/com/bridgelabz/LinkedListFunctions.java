package com.bridgelabz;

public class LinkedListFunctions {
    Node head;
    Node tail;
    public void addElementAtFirst(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            tail = node;
        }else {
            node.next = head;
            head = node;
        }
    }
    public void addElementAtLast(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
    }

    public void printList(){
        Node currentNode = head;
        if (head == null){
            System.out.println("Linked List is Empty");
        }
        while (currentNode != null){
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void insertElementAtPosition(int position, int data) {
        Node currentNode = head;
        for (int i = 0; i < (position-1); i++) {
            currentNode = currentNode.next;
        }
        Node node = new Node(data);
        node.next = currentNode.next;
        currentNode.next = node;
    }
    public void firstElementDelete(){
        if (head == null){
            System.out.println("Linked list is Empty");
        }
        head = head.next;
    }
    public void lastElementDelete() {
        if (head == null){
            System.out.println("Linked list is Empty");
        } else if (head == tail) {
            head = null;
            tail = null;
        }else {
            Node currentNode = head;
            while (currentNode.next != tail){
                currentNode = currentNode.next;
            }
            currentNode.next = null;
            tail = currentNode;
        }
    }
}