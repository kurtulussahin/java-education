package com.kurtulussahin.java.codekata.dataStructureImplementations.binarytree.bstinsertremove;

public class Bst {
    TreeNode root;

    public Bst(int val) {
        root=new TreeNode(val);
    }

    public TreeNode insert(TreeNode root, int val) {

        if(root==null){
            return new TreeNode(val);
        }

        if(val<root.val){
            root.left = insert(root.left, val);
        }else if (val>root.val) {
            root.right = insert(root.right, val);
        }

        return root;
    }
}
