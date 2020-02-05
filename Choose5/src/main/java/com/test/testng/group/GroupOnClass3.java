package com.test.testng.group;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupOnClass3 {
    public void teacher1(){
        System.out.println("GroupOnClass3中运行的teacher1111");
    }
    public void teacher2(){
        System.out.println("GroupOnClass1中运行的teacher2222");
    }
}
