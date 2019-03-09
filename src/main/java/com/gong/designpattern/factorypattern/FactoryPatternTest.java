package com.gong.designpattern.factorypattern;

/**
 * Created by gongls on 2019/3/8.
 */
public class FactoryPatternTest {
    public static void main(String[] args) {
        IOperationFactory factory = new OperationFactoryAdd();
        System.out.println(factory.getOperation().getResult(100.0f,200f));

        factory = new OperationFactorySub();
        System.out.println(factory.getOperation().getResult(100.0f,200f));
    }
}
