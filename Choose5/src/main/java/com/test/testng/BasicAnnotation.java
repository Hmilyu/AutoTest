package com.test.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod是在用例执行前执行");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod是在用例执行后执行");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass是在类运行之前执行");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass是在类运行之后执行");
    }

    @BeforeSuite
    public void befterSuite(){
        System.out.println("BeforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }





}
