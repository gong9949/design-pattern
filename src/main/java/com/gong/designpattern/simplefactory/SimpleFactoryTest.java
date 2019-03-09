package com.gong.designpattern.simplefactory;

/**
 * Created by gongls on 2019/3/8.
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        OperationFactory operationFactory = new OperationFactory();
        System.out.println(operationFactory.getResult(100.0f,"+",100f));
        System.out.println(operationFactory.getResult(100.0f,"-",100f));
        System.out.println(operationFactory.getResult(100.0f,"*",100f));
    }
}
