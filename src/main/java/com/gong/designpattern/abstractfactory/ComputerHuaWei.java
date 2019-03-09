package com.gong.designpattern.abstractfactory;

/**
 * Created by gongls on 2019/3/9.
 */
public class ComputerHuaWei implements  IComputer {
    @Override
    public ComputerInfo getComputer() {
        return new ComputerInfo("华为",6999f);
    }
}
