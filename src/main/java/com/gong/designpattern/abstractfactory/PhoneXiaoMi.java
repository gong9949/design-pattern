package com.gong.designpattern.abstractfactory;

/**
 * Created by gongls on 2019/3/9.
 */
public class PhoneXiaoMi implements  IPhone {
    @Override
    public PhoneInfo getPhone() {
        return new PhoneInfo("小米手机",999);
    }
}
