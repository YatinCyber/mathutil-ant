/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tinng.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtility {

    public static final double PI = 3.1415;

    // hàm tính giai thừa n!
    // không có giai thừa âm
    //0! = 1! = 1
    // vì giai thừa tăng giá trị rất nhanh, 20! vừa đủ cho 18 con số 0
    // tức là 21! tràn kiểu LONG
    //quy ước: hàm này chỉ tính tư 0 đến 20
    // có 2 cách viết hàm này, for truyền thống và đệ quy
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0 to 20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        //sống đến đoạn này, n từ 2..20 rồi, cứ dùng for
        long product = 1;//biến khởi động cho tích nhân dồn
        for (int i = 2; i < n + 1; i++) 
            product *= i;
        
        return product;

    }

}
