package com.gong.designpattern.simplefactory;

/**
 * Created by gongls on 2019/3/8.
 */
public class OperationFactory {

    public Float getResult(float numA, String type, float numB){
       IOperation operation;
       switch (type){
           case "+":
           default:
               operation= new OperationAdd();
               break;
           case "-":
               operation= new OperationSub();
               break;
           case "*":
               operation= new OperationMul();
               break;
       }
       return operation.getResult(numA,numB);
    }
}
