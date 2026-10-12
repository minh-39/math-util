package com.tumi.mathutil.core;

import org.junit.jupiter.api.Test;

import static com.tumi.mathutil.core.MathUtil.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

// TEST CASE 1: TEST hàm với đầu vào hợp lệ, n = 5 hy vọng trả về 120

    @Test
    void testFactorialGivenValidN5ReturnsWell120() {
        long expected = 120;
        int n = 5;
        long actual = getFactorial(n);

        // so sánh tự động giúp tôi expected có == actual hay ko
        // nếu == thì quất màu xanh
        // nếu != th quất màu đỏ
        assertEquals(expected, actual);
    }
    // TEST CASE 2: TEST hàm với đầu vào hợp lệ, n = 6 hy vọng trả về 720
    @Test
    void testFactorialGivenValidN6ReturnsWell720() {
        long expected = 720;
        int n = 6;
        long actual = getFactorial(n);

        // so sánh tự động giúp tôi expected có == actual hay ko
        // nếu == thì quất màu xanh
        // nếu != th quất màu đỏ
        assertEquals(expected, actual);
    }

    // TEST CASE 3: TEST hàm với đầu vào hợp lệ, n = 0 hy vọng trả về 1
    @Test
    void testFactorialGivenValidN0ReturnsWell1() {
        long expected = 1;
        int n = 0;
        long actual = getFactorial(n);

        // so sánh tự động giúp tôi expected có == actual hay ko
        // nếu == thì quất màu xanh
        // nếu != th quất màu đỏ
        assertEquals(expected, actual);
    }
    // TEST CASE 4: TEST hàm với đầu vào ko hợp lệ, n = -1 hy vọng trả về Ngoại lệ!! IllegalArgumentException
    @Test
    void testFactorialGivenInvalidNMinus1ThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> {getFactorial( -10);});
    }
}