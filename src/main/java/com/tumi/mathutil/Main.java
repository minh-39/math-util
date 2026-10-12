package com.tumi.mathutil;

import com.tumi.mathutil.core.MathUtil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
    testFactorialGivenValidN5ReturnsWell120();
        //TDD - VIẾT CODE BẮT ĐẦU TỪ VIẾT TEST

    }
    //test hàm tính giai thừa với n = 5 và hy vọng trả về 120, thực tế chờ xem có code đã!!
    public static void testFactorialGivenValidN5ReturnsWell120() {
        long expected = 120;
        int n = 5;
        long actual = MathUtil.getFactorial(n);


        //sout tab
        System.out.println("Check 5! | expected: "
               + expected + " | actual: " + actual);
    }
}

//CODE NÀY ĐỂ TEST CODE BASE, TEST CODE CHÍNH, THÌ CODE NÀY GỌI LÀ TEST SCRIPT
//CODE NÀY VỀ LÝ THUYẾT KKO CẦN SHIP CHO K/HÀNG
