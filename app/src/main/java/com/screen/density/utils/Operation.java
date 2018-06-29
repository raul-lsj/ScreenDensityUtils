package com.screen.density.utils;

/**
 * Created by Android on 2017/10/23.
 */

public class Operation {

    //加法
    public static final Double addition(double a, double b) {
        double add = a + b;
        return add;
    }

    //减法
    public static final Double subduction(double a, double b) {
        double sub = a - b;
        return sub;
    }

    //乘法
    public static final Double multiply(double a, double b) {
        double mul = a * b;
        return mul;
    }

    //除法
    public static final Double division(double a, double b) {
        double div = 0;
        if (b != 0) {
            div = a / b;
        } else {
            div = 0;
        }
        return div;
    }
}
