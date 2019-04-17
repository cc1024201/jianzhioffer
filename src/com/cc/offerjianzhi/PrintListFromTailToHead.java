package com.cc.offerjianzhi;
/*
题目描述
从尾到头反过来打印出每个结点的值。



解题思路
使用递归

 */

import java.util.ArrayList;
import java.util.Stack;

/**
 * @program: jianzhioffers
 * @description: 从尾到头打印链表
 * @author: Cc.
 * @create: 2019-04-17 15:18
 **/
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> ret = new ArrayList<>();
        if(listNode != null){
            ret.addAll(printListFromTailToHead(listNode.next));
            ret.add(listNode.val);
        }
        return ret;
    }

    /*
    使用头插法
    利用链表头插法为逆序的特点。

    头结点和第一个节点的区别：

    头结点是在头插法中使用的一个额外节点，这个节点不存储值；
    第一个节点就是链表的第一个真正存储值的节点。
     */
    public ArrayList<Integer> printListFromTailTOHead(ListNode listNode){
        //头插法构建逆序链表
        ListNode head = new ListNode(-1);
        while(listNode != null){
            ListNode memo = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = memo;
        }
        // 构建 ArrayList
        ArrayList<Integer> ret = new ArrayList<>();
        head = head.next;
        while (head != null) {
            ret.add(head.val);
            head = head.next;
        }
        return ret;
    }

    /*
    使用栈
     */
    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode){
        Stack<Integer> stack = new Stack<>();
        while(listNode != null){
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        while(!stack.isEmpty()){
            ret.add(stack.pop());
        }
        return ret;
    }
}
