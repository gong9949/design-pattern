package com.gong.designpattern.simplefactory;

/**
 * Created by gongls on 2019/3/8.
 */
public class OperationSub implements IOperation {
    @Override
    public Float getResult(float numA, float numB) {
        return numA-numB;
    }
}
