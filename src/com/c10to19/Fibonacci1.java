package com.c10to19;

/*题目描述
        求斐波那契数列的第 n 项，n <= 39。*/
/*解题思路
        如果使用递归求解，会重复计算一些子问题。例如，计算 f(4) 需要计算 f(3) 和 f(2)，计算 f(3) 需要计算 f(2) 和 f(1)，可以看到 f(2) 被重复计算了。
        递归是将一个问题划分成多个子问题求解，动态规划也是如此，但是动态规划会把子问题的解缓存起来，从而避免重复求解子问题。*/
/**
 * @program: jianzhioffer
 * @description: 斐波那契额数列1
 * @author: Cc.
 * @create: 2019-05-09 20:29
 **/
public class Fibonacci1 {
    public int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        int[] fib = new int[n+1];
        fib[1] = 1;
        for(int i=2; i<=n; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }
}
