package com.c3to9;

/*题目描述
        从尾到头反过来打印出每个结点的值。*/

/*解题思路
        使用递归
        要逆序打印链表 1->2->3（3,2,1)，可以先逆序打印链表 2->3(3,2)，最后再打印第一个节点 1。
        而链表 2->3 可以看成一个新的链表，要逆序打印该链表可以继续使用求解函数，也就是在求解函数中调用自己，这就是递归函数。*/

import java.util.ArrayList;

/**
 * @program: jianzhioffer
 * @description: 从尾到头打印链表1
 * @author: Cc.
 * @create: 2019-05-09 19:44
 **/

class ListNode{
    int val;
    ListNode next = null;

    ListNode(int val){
        this.val = val;
    }
}
public class PrintListFromTailToHead1 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> ret = new ArrayList<>();
        if(listNode != null){
            ret.addAll(printListFromTailToHead(listNode.next));
            ret.add(listNode.val);
        }
        return ret;
    }
}
