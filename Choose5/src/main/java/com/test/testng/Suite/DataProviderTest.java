package com.test.testng.Suite;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.xml.namespace.QName;
import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name="+name+"; age="+age);
    }

    @DataProvider(name = "data")
    public Object[][] dataProvider(){
        Object[][] o = new Object[][]{
                {"zhangsan",15},
                {"lisi",20},
                {"wangwu",30}
        };
        return o;
    }

    @Test(dataProvider = "dataMethod")
    public void test1(String name,int age){
        System.out.println("执行test1111中的方法，name="+name+"; age="+age);
    }
    @Test(dataProvider = "dataMethod")
    public void test2(String name,int age){
        System.out.println("执行test2222中的方法，name="+name+"; age="+age);
    }

    @DataProvider(name = "dataMethod")
    public Object[][] dataMethodTest(Method method){
        Object[][] result = null;
        if (method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan",10},
                    {"lisi",25}
            };
        }else if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"wangwu",50},
                    {"zhaoliu",60}
            };
        }
        return result;
    }

}
