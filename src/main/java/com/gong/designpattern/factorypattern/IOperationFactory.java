package com.gong.designpattern.factorypattern;

import com.gong.designpattern.simplefactory.IOperation;

/**
 * Created by gongls on 2019/3/8.
 */
public interface IOperationFactory {
    IOperation getOperation();
}
