package com.c10to19;
/*
由于待求解的 n 小于 40，因此可以将前 40 项的结果先进行计算，之后就能以 O(1) 时间复杂度得到第 n 项的值。*/
/**
 * @program: jianzhioffer
 * @description: 斐波那契数列的3
 * @author: Cc.
 * @create: 2019-05-09 20:35
 **/
public class Fibonacci3 {
    private int[] fib = new int[40];
    public Fibonacci3(){
        fib[1] = 1;
        for(int i=2; i<fib.length; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
    }
    public int fibonacci(int n){
        return fib[n];
    }
}
