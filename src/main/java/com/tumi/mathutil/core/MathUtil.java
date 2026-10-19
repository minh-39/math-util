package com.tumi.mathutil.core;

public class MathUtil {
    public static long getFactorial(int n) {
        // ĐỔI HÀM TÍNH THEO ĐỆ QUY
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0 and 20");
        }

        if (n == 0 || n == 1) {
            return 1; //điểm dừng đệ quy, ko lùi nữa, lùi den 1 là tính dc
        }

        // tính dc n! = ( n - 1 )! x n
        return n * getFactorial(n - 1);

        //TỐI ƯU, TINH CHỈNH CODE CHO NÓ HAY HƠN, ỔN HƠN (THUẬT TOÁN CHẠY NHANH HƠN)
        //VIỆC CHỈNH CODE TỐT HƠN GỌI LÀ REFACTOR/ REFACTORING

        //        long result = 1; //CỐ TINH đổi sang 10 THỬ XEM GITHUB ACTIONS CÓ PHÁT HIỆN RA CODE LỖI LOGIC HAY KO
//        //fix lại từ 10 thành 1để passed testcase, để thấy màu xanh trên github
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid n. n must be between 0 and 20");
//        }
//        // n dang on lam vong` lap for mà tính dồn, nhân dồn vào result
//        for (int i = 1; i <=n; i++){
//            result *=i;
//        }
//        return result;
    }
}



//CODE CHÍNH, CODE BASE, CODE
