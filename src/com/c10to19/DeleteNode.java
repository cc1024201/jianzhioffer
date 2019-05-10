package com.c10to19;


/**
 * @program: jianzhioffer
 * @description: 在 O(1) 时间内删除链表节点
 * @author: Cc.
 * @create: 2019-05-10 10:25
 **/
class ListNode{
    int val;
    ListNode next = null;

    ListNode(int val){
        this.val = val;
    }
}

public class DeleteNode {
    public ListNode deleteNode(ListNode head, ListNode tobeDelete){
        if(head == null || tobeDelete == null){
            return null;
        }
        if(tobeDelete.next != null){
            //要删除的节点不是尾节点
            ListNode next = tobeDelete.next;
            tobeDelete.val = next.val;
            tobeDelete.next = next.next;
        }else{
            if(head == tobeDelete){
                //只有一个节点
                head = null;
            }else{
                ListNode cur = head;
                while(cur.next != tobeDelete){
                    cur = cur.next;
                }
                cur.next = null;
            }
        }
        return head;
    }
}
