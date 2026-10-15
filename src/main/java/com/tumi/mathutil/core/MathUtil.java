package com.tumi.mathutil.core;

public class MathUtil {
    public static long getFactorial(int n) {
        long result = 10; //CỐ TINH THỬ XEM GITHUB ACTIONS CÓ PHÁT HIỆN RA CODE LỖI LOGIC HAY KO

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0 and 20");
        }
        // n dang on lam vong` lap for mà tính dồn, nhân dồn vào result
        for (int i = 1; i <=n; i++){
            result *=i;
        }
        return result;
    }
}



//CODE CHÍNH, CODE BASE, CODE
