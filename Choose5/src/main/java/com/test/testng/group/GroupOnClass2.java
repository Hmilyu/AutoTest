package com.test.testng.group;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClass2 {
    public void stu1(){
        System.out.println("GroupOnClass2中运行的stu11111");
    }
    public void stu2(){
        System.out.println("GroupOnClass2中运行的stu22222");
    }
}
