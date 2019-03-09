package com.gong.designpattern.factorypattern;

import com.gong.designpattern.simplefactory.IOperation;
import com.gong.designpattern.simplefactory.OperationSub;

/**
 * Created by gongls on 2019/3/8.
 */
public class OperationFactorySub implements IOperationFactory {
    @Override
    public IOperation getOperation() {
        return  new OperationSub();
    }
}
