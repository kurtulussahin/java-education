package com.kurtulussahin.codekata.dataStructureImplementations.binarytree.bstinsertremove;

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

    public TreeNode minValueNode(TreeNode root) {
        TreeNode curr=root;

        while (curr != null && curr.left!=null){
            curr=curr.left;
        }

        return curr;
    }

    public TreeNode remove(TreeNode root, int val) {

        if(root==null){
            return null;
        }

        if(val>root.val){
            root.right=remove(root.right, val);
        }else if (val<root.val){
            root.left=remove(root.left, val);;
        }else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }else {
                TreeNode minNode = minValueNode(root.right);
                root.val = minNode.val;
                root.right = remove(root.right, minNode.val);
            }
        }
        return root;
    }
}
