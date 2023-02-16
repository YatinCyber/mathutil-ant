/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tinng.mathutil.main;

import com.tinng.mathutil.core.MathUtility;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        testFactorialGivenWrongArgumentThrowsException();
//        testFactorialGivenRightArgumentRunsWell();
    }
    
    
    //dân dev phải có trách nhiệm test code của mình chạy đúng hay sai trước khi lắp
    //ráp nó với các class khác để hình thành nên các chức năng
    //có nhiều quy tắc đặt tên hàm cho việc kiểm thử hàm
    //thường tên hàm sẽ bao hàm ý nghĩa của việc kiểm thử
    //vd: hàm dưới đây dùng để test cái hàm tính giai thừa
    //trong tình huống case đưa n đúng chuẩn, thì ta hy vọng
    //hàm sẽ chạy ngon như thiế tkees, vid n = 5 thì hàm phải trả về 120
    //tức là 5! hy vọng hàm tính ra 120
    public static void testFactorialGivenRightArgumentRunsWell(){
        
        //Test Case #1: Test getFactorial with n = 0;
        //Expected value: hy vọng đưa n = 0 vào thì hàm trả ra 1;
        int n = 0;
        long expectedValue = 1;
        long actualValue =  MathUtility.getFactorial(n);
        System.out.println("Test " + n + "!: expected = " + expectedValue
                                        + " | actual = " + actualValue);
        
        //Test Case #2: Test getFactorial with n = 1;
        //Expected value: hy vọng đưa n = 0 vào thì hàm trả ra 1;
        n = 1;
        expectedValue = 1;
        System.out.println("Test " + n + "!: expected = " + expectedValue
                                        + " | actual = " + MathUtility.getFactorial(n));
        
        //Test Case #3: Test getFactorial with n = 2;
        //Expected value: hy vọng đưa n = 0 vào thì hàm trả ra 2;
        
        System.out.println("Test 3!: expected = 6"
                                        + " | actual = " + MathUtility.getFactorial(n));
        
    }
    
    //thiết kế hàm getF() chỉ tính n! từ 0 đến 20
    //nếu đưa n nhỏ hơn không hoặc lớn hơn 20 thì hàm không tính - chửi
    //bằng cách ném ra ngoại lệ
    
    // thực tế hàm getF() khi chạy có làm đuọc như thiết kế hay ko
    //phải test thử, chạy thử mới biết được
    public static void testFactorialGivenWrongArgumentThrowsException(){
        
        //Test Case #4: Test getFactorial with n = -5;
        //Expected value: an exception is thrown: IllegalArgumentException ;
        int n = -5;
        System.out.println("Test -5!: expected = Illegal Argument Exception is throwned!");
        MathUtility.getFactorial(-5);//Exception thì không in ra được. Không in được testcase
    }
}
