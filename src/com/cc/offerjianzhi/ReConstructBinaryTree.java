package com.cc.offerjianzhi;
/*
题目描述
根据二叉树的前序遍历和中序遍历的结果，重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。

preorder = [3,9,20,15,7]
inorder =  [9,3,15,20,7]


解题思路
前序遍历的第一个值为根节点的值，使用这个值将中序遍历结果分成两部分，左部分为树的左子树中序遍历结果，右部分为树的右子树中序遍历的结果。


 */


import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: jianzhioffer
 * @description: 重建二叉树
 * @author: Cc.
 * @create: 2019-04-17 16:10
 **/
public class ReConstructBinaryTree {

    private Map<Integer, Integer> indexForInOrders = new HashMap<>();

    public TreeNode reConstructBinaryTree(int[] pre, int[] in){
        for(int i=0; i<in.length; i++){
            indexForInOrders.put(in[i], i);
        }
        return reConstructBinaryTree(pre, 0, pre.length-1, 0);
    }

    private TreeNode reConstructBinaryTree(int[] pre, int preL, int preR, int inL){
        if(preL > preR){
            return null;
        }
        TreeNode root = new TreeNode(pre[preL]);
        int inIndex = indexForInOrders.get(root.val);
        int leftTreeSize = inIndex - inL;
        root.left = reConstructBinaryTree(pre, preL+1, preL+leftTreeSize, inL);
        root.right = reConstructBinaryTree(pre, preL+leftTreeSize+1, preR, inL+leftTreeSize+1);
        return root;
    }
}
