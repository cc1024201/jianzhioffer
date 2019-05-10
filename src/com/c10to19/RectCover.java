package com.c10to19;

/*题目描述
        我们可以用 2*1 的小矩形横着或者竖着去覆盖更大的矩形。请问用 n 个 2*1 的小矩形无重叠地覆盖一个 2*n 的大矩形，总共有多少种方法？*/
/*解题思路
        当 n 为 1 时，只有一种覆盖方法
        当 n 为 2 时，有两种覆盖方法
        要覆盖 2*n 的大矩形，可以先覆盖 2*1 的矩形，再覆盖 2*(n-1) 的矩形；或者先覆盖 2*2 的矩形，再覆盖 2*(n-2) 的矩形。
        而覆盖 2*(n-1) 和 2*(n-2) 的矩形可以看成子问题。*/
/**
 * @program: jianzhioffer
 * @description: 矩形覆盖
 * @author: Cc.
 * @create: 2019-05-09 20:38
 **/
public class RectCover {
    public int rectCover(int n){
        if(n <=2){
            return n;
        }
        int pre2 = 1, pre1 =2;
        int result = 0;
        for(int i=3; i<=n; i++){
            result = pre2 + pre1;
            pre2 = pre1;
            pre1 = result;
        }
        return result;
    }
}
