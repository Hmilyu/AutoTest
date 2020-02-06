package com.test.testng;

import org.testng.annotations.Test;

public class Depend {
    //依赖测试
    @Test
    public void test1(){
        System.out.println("test1 run");
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
