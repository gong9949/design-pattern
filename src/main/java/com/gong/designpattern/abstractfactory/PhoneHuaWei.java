package com.gong.designpattern.abstractfactory;

/**
 * Created by gongls on 2019/3/9.
 */
public class PhoneHuaWei implements  IPhone {
    @Override
    public PhoneInfo getPhone() {
        return new PhoneInfo("华为",1999f);
    }
}
