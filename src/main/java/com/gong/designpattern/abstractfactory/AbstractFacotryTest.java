package com.gong.designpattern.abstractfactory;

import com.alibaba.fastjson.JSON;

/**
 * Created by gongls on 2019/3/9.
 */
public class AbstractFacotryTest {
    public static void main(String[] args) {
        IElectronicFactory eleHW = new ElectronicFactoryHW();
        System.out.println(JSON.toJSONString(eleHW.getComputer().getComputer()));
        System.out.println(JSON.toJSONString(eleHW.getPhone().getPhone()));

        IElectronicFactory eleXM = new ElectronicFactoryXM();
        System.out.println(JSON.toJSONString(eleXM.getComputer().getComputer()));
        System.out.println(JSON.toJSONString(eleXM.getPhone().getPhone()));


    }
}
