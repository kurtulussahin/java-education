package com.kurtulussahin.java.codekata.dataStructureImplementations.doublyLinkedListTdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
    void insertEnd(){

        DoublyLinkedList dLList = new DoublyLinkedList();
        dLList.insertEnd(20);
        assertEquals(20,dLList.tail.prev.val);
    }
}
