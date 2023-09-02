package edu.hillel.lesson4.inheritance;

public class Square extends Rectangle{

    public void setSize(int size){
        super.setHeight(size);
        super.setWidth(size);
    }
}
