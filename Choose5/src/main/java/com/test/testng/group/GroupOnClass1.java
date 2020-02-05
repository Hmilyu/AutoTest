package com.test.testng.group;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClass1 {
    public void stu1(){
        System.out.println("GroupOnClass1中运行的stu1111");
    }
    public void stu2(){
        System.out.println("GroupOnClass1中运行的stu222");
    }
}
