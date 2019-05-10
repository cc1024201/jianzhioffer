package com.c10to19;
/*
题目描述
        输入一个整数，输出该数二进制表示中 1 的个数。*/
/*n&(n-1)
        该位运算去除 n 的位级表示中最低的那一位。

        n       : 10110100
        n-1     : 10110011
        n&(n-1) : 10110000
        时间复杂度：O(M)，其中 M 表示 1 的个数。*/
/**
 * @program: jianzhioffer
 * @description: 二进制中1的个数
 * @author: Cc.
 * @create: 2019-05-09 22:18
 **/
public class NumberOf1 {
    public int numberOf1(int n){
        int cnt = 0;
        while(n != 0){
            cnt++;
            n &= (n-1);
        }
        return cnt;
    }
    public int numberOf2(int n){
        return Integer.bitCount(n);
    }
}
