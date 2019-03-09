package com.gong.designpattern.abstractfactory;

/**
 * Created by gongls on 2019/3/9.
 */
public class ElectronicFactoryHW implements  IElectronicFactory{
    @Override
    public IPhone getPhone() {
        return  new PhoneHuaWei();
    }

    @Override
    public IComputer getComputer() {
        return new ComputerHuaWei();
    }
}
