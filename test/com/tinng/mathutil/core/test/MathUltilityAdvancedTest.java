/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tinng.mathutil.core.test;

import com.tinng.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Admin
 */
@RunWith(value = Parameterized.class)
//báo với junit rằng t sẽ code trong class này
//t sẽ tách dât và hàm so sách riêng biệt với nhau  - data driven testing
//fill trở lại thông qua biết - biếnt chưa value được thay đổi
//DDT có anh em nương tựa với parameterized: tham số hoá data
public class MathUltilityAdvancedTest {
    //cần chuẩn bị mảng 2 chiều để chứa data trong các test case
    //quy ước mảng phải là static public
    @Parameterized.Parameters
    //có s là tập data
    //báo cho junit kêu đây là data, lát hãy lấy ra xài
    public static Object[][] initData(){
        return new Object[][]{
                                {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {5, 120},
                                {6, 720}
        };
    }
    
    
    //map từng cặp data ở trên vào 2 biết cục bộ, và đẩy 2 biến này vào hàm assert.Equals
    @Parameterized.Parameter(value = 0)//lấy cột 0 của mảng gắn vào
    public int n;
    @Parameterized.Parameter(value = 1)//lấy cột 1 của mảng gắn vào
    public long expected;
     
     
    ///////////////test
    @Test
    public void testFactorialGivenRightArgumentReturnsWell(){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
    
    
}
