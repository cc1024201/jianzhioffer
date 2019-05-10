package com.c3to9;

/*题目描述
        给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。*/

/*解题思路
        ① 如果一个节点的右子树不为空，那么该节点的下一个节点是右子树的最左节点；
        ② 否则，向上找第一个左链接指向的树包含该节点的祖先节点。
*/
/**
 * @program: jianzhioffer
 * @description: 二叉树的下一个节点
 * @author: Cc.
 * @create: 2019-05-09 20:15
 **/
class TreeLinkNode{
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode parent = null;

    TreeLinkNode(int val){
        this.val = val;
    }
}
public class GetNext {
    public TreeLinkNode getNext(TreeLinkNode pNode){
        if(pNode.right != null){
            TreeLinkNode node = pNode.right;
            while(node.left != null){
                node = node.left;
            }
            return node;
        }else{
            while(pNode.parent != null){
                TreeLinkNode parent = pNode.parent;
                if(parent.left == pNode){
                    return parent;
                }
                pNode = pNode.parent;
            }
        }
        return null;
    }
}
