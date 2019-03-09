package com.gong.designpattern.abstractfactory;

/**
 * Created by gongls on 2019/3/9.
 */
public interface IElectronicFactory {
    IPhone getPhone();
    IComputer getComputer();
}
