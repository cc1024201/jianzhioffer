package com.c3to9;

/*使用栈
        栈具有后进先出的特点，在遍历链表时将值按顺序放入栈中，最后出栈的顺序即为逆序。*/

import java.util.ArrayList;
import java.util.Stack;

/**
 * @program: jianzhioffer
 * @description: 从尾到头打印链表3
 * @author: Cc.
 * @create: 2019-05-09 19:57
 **/
public class PrintListFromTailToHead3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
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
