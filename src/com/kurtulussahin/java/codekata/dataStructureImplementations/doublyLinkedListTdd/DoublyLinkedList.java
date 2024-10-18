package com.kurtulussahin.java.codekata.dataStructureImplementations.doublyLinkedListTdd;


public class DoublyLinkedList {
    DoublyLinkedListNode tail;
    DoublyLinkedListNode head;

    public DoublyLinkedList() {
        tail=new DoublyLinkedListNode(-1);
        head=new DoublyLinkedListNode(-1);

        head.next=tail;
        tail.prev=head;
    }

    public void insertFront(int val) {
        DoublyLinkedListNode newNode =  new DoublyLinkedListNode(val);
        newNode.prev=head;
        newNode.next=head.next;

        head.next.prev = newNode;
        head.next=newNode;
    }
}
