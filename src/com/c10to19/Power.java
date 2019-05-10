package com.c10to19;
/*
题目描述
        给定一个 double 类型的浮点数 base 和 int 类型的整数 exponent，求 base 的 exponent 次方。*/
/**
 * @program: jianzhioffer
 * @description: 数值的整数次方
 * @author: Cc.
 * @create: 2019-05-09 22:24
 **/
public class Power {
    public double power(double base, int exponent){
        if(exponent == 0){
            return 1;
        }
        if(exponent == 1){
            return base;
        }
        boolean isNegative = false;
        if(exponent < 0){
            exponent = -exponent;
            isNegative = true;
        }
        double pow = power(base * base, exponent / 2);
        if(exponent % 2 != 0){
            pow = pow * base;
        }
        return isNegative ? 1/pow : pow;
    }
}
