package com.kurtulussahin.codekata.dataStructureImplementations.binarytree.bstinsertremove;

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

    @Test
    void getMinVAlueNode(){
        Bst tree = new Bst(10);
        tree.insert(tree.root,9);
        tree.insert(tree.root,5);
        tree.insert(tree.root,7);
        tree.insert(tree.root,3);
        tree.insert(tree.root,20);
        tree.insert(tree.root,30);
        tree.insert(tree.root,21);
        assertEquals(3, tree.minValueNode(tree.root).val);
    }

    @Test
    void removeRightLeaf(){
        Bst tree = new Bst(10);
        tree.insert(tree.root, 11);
        tree.remove(tree.root, 11);
        assertNull(tree.root.right);
    }

    @Test
    void removeLeftLeaf(){
        Bst tree = new Bst(10);
        tree.insert(tree.root, 9);
        tree.remove(tree.root, 9);
        assertNull(tree.root.left);
    }

    @Test
    void removeTwoRightLeaf(){
        Bst tree = new Bst(10);
        tree.insert(tree.root, 11);
        tree.insert(tree.root, 12);

        tree.remove(tree.root, 12);
        assertNull(tree.root.right.right);
    }

    @Test
    void removeInBetweenNode(){
        Bst tree = new Bst(10);
        tree.insert(tree.root,9);
        tree.insert(tree.root,5);
        tree.insert(tree.root,7);
        tree.insert(tree.root,3);
        tree.insert(tree.root,20);
        tree.insert(tree.root,30);
        tree.insert(tree.root,21);

        tree.remove(tree.root, 9);
        assertEquals(10, tree.root.val);
        assertEquals(5, tree.root.left.val);
        assertEquals(7, tree.root.left.right.val);

    }
}
