package com.gong.designpattern.abstractfactory;

/**
 * Created by gongls on 2019/3/9.
 */
public class ComputerInfo {
    private String name;
    private float  price;
    private String version;


    public ComputerInfo(){

    }

    public ComputerInfo(String name, float price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
