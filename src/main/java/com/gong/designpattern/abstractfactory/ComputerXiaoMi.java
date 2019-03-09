package com.gong.designpattern.abstractfactory;

/**
 * Created by gongls on 2019/3/9.
 */
public class ComputerXiaoMi implements  IComputer {
    @Override
    public ComputerInfo getComputer() {
        return new ComputerInfo("小米",5999f);
    }
}
