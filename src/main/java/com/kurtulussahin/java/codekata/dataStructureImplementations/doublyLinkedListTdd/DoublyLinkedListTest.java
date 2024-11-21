package com.kurtulussahin.java.codekata.dataStructureImplementations.doublyLinkedListTdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class DoublyLinkedListTest {

    @Test
    void createDoublyLinkedListNode(){

        DoublyLinkedListNode node = new DoublyLinkedListNode(10);
        assertNull(node.next);
        assertNull(node.prev);
        assertEquals(10,node.val);
    }

    @Test
    void createDoublyLinkedList(){

        DoublyLinkedList dLList = new DoublyLinkedList();
        assertEquals(dLList.head.next,dLList.tail);
        assertEquals(dLList.tail.prev,dLList.head);
    }

    @Test
    void insertFront(){

        DoublyLinkedList dLList = new DoublyLinkedList();
        dLList.insertFront(20);
        assertEquals(20,dLList.head.next.val);
    }

    @Test
    void getIndex(){

        DoublyLinkedList dLList = new DoublyLinkedList();
        dLList.insertFront(20);
        dLList.insertFront(50);
        dLList.insertFront(100);
        dLList.insertFront(200);

        assertEquals(50,dLList.getAtIndex(2).val);
    }

    @Test
    void setAtIndex(){

        DoublyLinkedList dLList = new DoublyLinkedList();
        dLList.insertFront(20);
        dLList.insertFront(50);
        dLList.insertFront(100);
        dLList.insertFront(200);

        assertEquals(50,dLList.getAtIndex(2).val);
        dLList.insertAtIndex(2,1000);
        assertEquals(1000,dLList.getAtIndex(2).val);
    }

    @Test
    void insertEnd(){

        DoublyLinkedList dLList = new DoublyLinkedList();
        dLList.insertEnd(20);
        assertEquals(20,dLList.tail.prev.val);
    }

    @Test
    void removeFront(){

        DoublyLinkedList dLList = new DoublyLinkedList();
        dLList.insertFront(20);
        dLList.insertFront(50);
        dLList.insertFront(100);

        assertEquals(100,dLList.head.next.val);
        dLList.removeFront();
        assertEquals(50,dLList.head.next.val);

    }

    @Test
    void removeEnd(){

        DoublyLinkedList dLList = new DoublyLinkedList();
        dLList.insertFront(20);
        dLList.insertFront(50);
        dLList.insertFront(100);

        assertEquals(20,dLList.tail.prev.val);
        dLList.removeEnd();
        assertEquals(50,dLList.tail.prev.val);

    }

    @Test
    void print() throws UnsupportedEncodingException {
        DoublyLinkedList dLList = new DoublyLinkedList();
        dLList.insertFront(20);
        dLList.insertFront(50);
        dLList.insertFront(100);

        var storage = new ByteArrayOutputStream();
        var out = new PrintStream(storage);
        dLList.print(out);
        var result = storage.toString("utf-8");
        assertEquals("100 -> 50 -> 20 -> ", result.substring(0));

    }

}
