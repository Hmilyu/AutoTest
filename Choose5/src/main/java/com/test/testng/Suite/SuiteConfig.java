package com.test.testng.Suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

//配置测试套件的类
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("运行测试套件BeforeSuite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("结束测试套件AfterSuite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("测试前运行BeforeTest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("测试后运行AfterTest");
    }
}
