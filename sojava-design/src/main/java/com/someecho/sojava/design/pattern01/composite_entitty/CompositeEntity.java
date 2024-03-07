package com.someecho.sojava.design.pattern01.composite_entitty;

/**
 * Created by mlh on 2018/1/1.
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();
    //...

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
