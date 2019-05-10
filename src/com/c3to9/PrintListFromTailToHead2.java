package com.c3to9;


/*使用头插法
        使用头插法可以得到一个逆序的链表。

        头结点和第一个节点的区别：

        头结点是在头插法中使用的一个额外节点，这个节点不存储值；
        第一个节点就是链表的第一个真正存储值的节点。*/

import java.util.ArrayList;

/**
 * @program: jianzhioffer
 * @description: 从尾到头打印链表2
 * @author: Cc.
 * @create: 2019-05-09 19:51
 **/

public class PrintListFromTailToHead2 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        //头插法构建逆序链表
        ListNode head = new ListNode(-1);
        while(listNode != null){
            ListNode memo = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = memo;
        }
        //构建ArrayList
        ArrayList<Integer> ret = new ArrayList<>();
        head = head.next;
        while(head != null){
            ret.add(head.val);
            head = head.next;
        }
        return ret;
    }
}
