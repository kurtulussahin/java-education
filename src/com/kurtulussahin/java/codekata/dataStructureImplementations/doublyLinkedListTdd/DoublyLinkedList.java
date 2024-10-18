package com.kurtulussahin.java.codekata.dataStructureImplementations.doublyLinkedListTdd;


import java.io.PrintStream;

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

    public void insertEnd(int val) {
        DoublyLinkedListNode newNode =  new DoublyLinkedListNode(val);
        newNode.next=tail;
        newNode.prev=tail.prev;

        tail.prev.next = newNode;
        tail.prev=newNode;
    }

    public void removeFront() {
        head.next.next.prev=head;
        head.next=head.next.next;
    }

    public void removeEnd() {
        tail.prev.prev.next=tail;
        tail.prev=tail.prev.prev;
    }

    public void print(PrintStream out) {
        DoublyLinkedListNode curr = head.next;
        while (curr != tail) {
            out.print(curr.val + " -> ");
            curr = curr.next;
        }
        //out.println();
    }
}
