package com.c10to19;

/**
 * @program: jianzhioffer
 * @description: 删除链表中重复的节点
 * @author: Cc.
 * @create: 2019-05-10 10:46
 **/
public class DeleteDuplication {
    public ListNode deleteDuplication(ListNode pHead){
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode next = pHead.next;
        if(pHead.val == next.val){
            while(next != null && pHead.val == next.val){
                next = next.next;
            }
            return deleteDuplication(next);
        }else{
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }
}
