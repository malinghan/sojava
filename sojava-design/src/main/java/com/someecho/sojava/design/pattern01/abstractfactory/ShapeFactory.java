package com.someecho.sojava.design.pattern01.abstractfactory;

/**
 * Created by mlh on 2017/12/24.
 */
public class ShapeFactory  extends AbstractFactory{
    //getShape用于获取对象
    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
    @Override
    Color getColor(String color) {
        return null;
    }
}
