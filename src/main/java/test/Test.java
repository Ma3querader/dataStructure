package test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: panyusheng
 * @Date: 2021/6/21
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("test.TargetObject");
        TargetObject targetObject = (TargetObject) clazz.newInstance();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        System.out.println("----------------");
        Method publicMethod = clazz.getDeclaredMethod("publicMethod", String.class);
        publicMethod.invoke(targetObject, "吃屎");
        System.out.println("----------------");
        Field value = clazz.getDeclaredField("value");
        value.setAccessible(true);
        value.set(targetObject, "fuck");
        Method privateMethod = clazz.getDeclaredMethod("privateMethod");
        //为了调用private方法我们取消安全检查
        privateMethod.setAccessible(true);
        privateMethod.invoke(targetObject);


    }

}

class TargetObject {
    private String value;

    public TargetObject() {
        value = "JavaGuide";
    }

    public void publicMethod(String s) {
        System.out.println("u love " + s);
    }

    private void privateMethod() {
        System.out.println("value is " + value);
    }
}