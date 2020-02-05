package com.test.testng.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import org.w3c.dom.ls.LSOutput;

public class GroupOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试方法11111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的测试方法222222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试方法333333");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试方法444444");
    }
    @BeforeGroups("server")
    public void beforeGroupServerMethod(){
        System.out.println("这是服务端组运行前运行的方法！！！！");
    }
    @AfterGroups("server")
    public void afterGroupServerMethod(){
        System.out.println("这是服务端组运行后运行的方法！！！！");
    }
    @BeforeGroups("client")
    public void beforeGroupClientMethod(){
        System.out.println("这是客户端组运行前运行的方法！！！！");
    }
    @AfterGroups("client")
    public void afterGroupClientMethod(){
        System.out.println("这是客户端组运行后运行的方法！！！！");
    }
}
