package com.mf.test;

public class Main9 {
    public static void main(String[] args) {
         Main9 m = new Main9();
        TreeNode node = new TreeNode(12);
        node.left = new TreeNode(13);
        node.left.right = new TreeNode(11);
        node.right = new TreeNode(3);
        node.right.right = new TreeNode(10);
        System.out.println(m.sumOfLeftLeaves(node));
    }

    public int sumOfLeftLeaves(TreeNode root){
        return root == null ? 0 : sumValue(root);
    }

    public int sumValue(TreeNode node){
        int ans = 0;
        //是左节点，则加上节点的值
        if(node.left != null) {
            ans += isLeafNode(node.left) ? node.left.value : sumValue(node.left);
        }
        //是右节点，则会继续寻找左节点
        if(node.right != null && isLeafNode(node.right)) {
            ans += sumValue(node.right);
        }
        return ans;
    }

    public boolean isLeafNode(TreeNode node){
        return node.left == null && node.right == null;
    }
}

class TreeNode{
    TreeNode left;
    TreeNode right;
    int value;

    public TreeNode(int value){
        this.value = value;
    }
}