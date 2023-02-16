/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tinng.mathutil.core.test;

import com.tinng.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;
/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    
    //kiểm thử ngoạ lệ thì sao??
    // tức là hàm getF được thiết kế rằng nếu đưa n xàm 
    //thì hàm phải ném ra ngoại lệ 
    //tức là getF -5 thì EXPECTED == NGOẠI LỆ ILLEGAL ARGUMENT EXCEPTION
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException(){
        //Test casse 5: get F wwith a wrong arg: n = -5
        //expected result: an exception is thrown: illegall argument exception
        //gõ lênh này gây ra ễcption và exception là màu đỏ
        // nhưng hàm này mình kì vòng là excp thì nó đúng thiết kế
        // nếu đúng thì phải có màu xanh chứ ? 
        // vậy lỗi của ta là không so sánh là có ngoại lệ hay không 
        //J unit 4 không dùng assert để đo ngoại lệ, nhưng j unit 5 thì có thể.
        MathUtility.getFactorial(-5);
    }
       
    
    //Trong hàm này sẽ chuacws các test case để test getF()
    //với n hợp lệ trong khoảng 0 20
    @Test
    public void testFactorialGivenRightArgumentReturnsWell(){
        //Test cases #1: test getF() with n = 0
        //Expected value = 1; // hy vong 0! = 1
        int n = 0;
        long expectedValue = 1;// hy vong 0! = 1
        long actualValue = MathUtility.getFactorial(n); // thuc te getF() tra ve may
        
        Assert.assertEquals(expectedValue, actualValue);//day la ham static, xai truc tiep k can new
        //static phải chấm trực tiếp từ tên class
        //----------------------------------------------------
        //Test cases #2: test getF() with n = 5
        //Expected value = 1; // hy vong 0! = 1
        Assert.assertEquals(120, MathUtility.getFactorial(5));
        //----------------------------------------------------
        //Test cases #3: test getF() with n = 6
        //Expected value = 1; // hy vong 0! = 1
        Assert.assertEquals(720, MathUtility.getFactorial(6));
        //----------------------------------------------------
        //Test cases #4: test getF() with n = 4
        //Expected value = 1; // hy vong 0! = 24
        Assert.assertEquals(24, MathUtility.getFactorial(4));
        
    }
    
    
}
