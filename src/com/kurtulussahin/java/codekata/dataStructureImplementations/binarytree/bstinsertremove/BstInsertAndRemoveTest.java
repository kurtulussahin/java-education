package com.kurtulussahin.java.codekata.dataStructureImplementations.binarytree.bstinsertremove;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BstInsertAndRemoveTest {

    @Test
    void createTreeNode(){

        TreeNode node = new TreeNode(10);
        assertEquals(node.val, 10);
        assertNull(node.left);
        assertNull(node.right);

    }

    @Test
    void createBst(){

        Bst tree = new Bst(10);

    }
}
