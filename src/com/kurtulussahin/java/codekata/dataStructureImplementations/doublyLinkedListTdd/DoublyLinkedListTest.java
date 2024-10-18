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
        assertEquals(node.val,10);
    }

    @Test
    void createDoublyLinkedList(){

        DoublyLinkedList dLList = new DoublyLinkedList();
        assertEquals(dLList.head.next,dLList.tail);
        assertEquals(dLList.tail.prev,dLList.head);
    }
}
