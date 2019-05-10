package com.c10to19;

/*考虑到第 i 项只与第 i-1 和第 i-2 项有关，因此只需要存储前两项的值就能求解第 i 项，从而将空间复杂度由 O(N) 降低为 O(1)。*/
/**
 * @program: jianzhioffer
 * @description: 斐波那契额数列2
 * @author: Cc.
 * @create: 2019-05-09 20:33
 **/
public class Fibonacci2 {
    public int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        int pre2 = 0; int pre1 = 1;
        int fib = 0;
        for(int i=2; i<=n; i++){
            fib = pre2 + pre1;
            pre2 = pre1;
            pre1 = fib;
        }
        return fib;
    }
}
