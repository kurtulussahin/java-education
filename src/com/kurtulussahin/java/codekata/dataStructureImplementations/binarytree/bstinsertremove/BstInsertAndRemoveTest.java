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

    @Test
    void insertRightLeaf(){
        Bst tree = new Bst(10);
        tree.insert(tree.root, 11);
        assertEquals(11, tree.root.right.val);
    }

    @Test
    void insertLeftLeaf(){
        Bst tree = new Bst(10);
        tree.insert(tree.root,9);
        assertEquals(9, tree.root.left.val);
    }

    @Test
    void insertTwoLeftLeaf(){
        Bst tree = new Bst(10);
        tree.insert(tree.root,9);
        tree.insert(tree.root,8);
        assertEquals(9, tree.root.left.val);
        assertEquals(8, tree.root.left.left.val);
    }
}
