package com.usefulcode.decorator;

/**
 * Created by zhangyaping on 18/12/2.
 */
public class ConcreteComponent implements Component {
    @Override
    public void doSomething() {
        System.out.println("功能A");
    }
}
