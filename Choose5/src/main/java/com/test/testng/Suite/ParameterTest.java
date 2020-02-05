package com.test.testng.Suite;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.xml.namespace.QName;

public class ParameterTest {
    //参数化测试
    @Test
    @Parameters({"name","age"})
    public void param(String name, int age){
        System.out.println("name="+name +"; age="+age );
    }
}

