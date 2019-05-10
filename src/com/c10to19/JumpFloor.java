package com.c10to19;

/*题目描述
        一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。*/
/*解题思路
        当 n = 1 时，只有一种跳法
        当 n = 2 时，有两种跳法
        跳 n 阶台阶，可以先跳 1 阶台阶，再跳 n-1 阶台阶；或者先跳 2 阶台阶，再跳 n-2 阶台阶。而 n-1 和 n-2 阶台阶的跳法可以看成子问题*/
/**
 * @program: jianzhioffer
 * @description: 跳台阶
 * @author: Cc.
 * @create: 2019-05-09 20:42
 **/
public class JumpFloor {
    public int jumpFloor(int n){
        if(n <= 2){
            return n;
        }
        int pre2 = 1, pre1 = 2;
        int result = 1;
        for(int i=2; i<n; i++){
            result = pre2 + pre1;
            pre2 = pre1;
            pre1 = result;
        }
        return result;
    }
}
