package com.gong.designpattern.abstractfactory;

/**
 * Created by gongls on 2019/3/9.
 */
public class ElectronicFactoryXM  implements  IElectronicFactory{
    @Override
    public IPhone getPhone() {
        return  new PhoneXiaoMi();
    }

    @Override
    public IComputer getComputer() {
        return new ComputerXiaoMi();
    }
}
